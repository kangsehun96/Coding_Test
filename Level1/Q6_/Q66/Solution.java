package Level1.Q6_.Q66;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] participant, String[] completion) {
        Map<String, Integer> map = new HashMap<>();

        // 1. 참가자 수 카운트
        for (String p : participant) {
            map.put(p, map.getOrDefault(p, 0) + 1);
        }

        // 2. 완주자 수만큼 감소
        for (String c : completion) {
            map.put(c, map.get(c) - 1);
        }

        // 0보다 큰 값이 남아있다면 완주하지 못한 선수
        for (String s : map.keySet()) {
            if (map.get(s) > 0) {
                return s;
            }
        }
        return "";
    }
}
