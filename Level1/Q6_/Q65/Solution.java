package Level1.Q6_.Q65;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public int[] solution(String[] keymap, String[] targets) {
        // 1. 각 문자별로 최소 입력 횟수를 저장할 HashMap
        Map<Character, Integer> map = new HashMap<>();

        // 2. keymap 의 문자열 순회
        // 각 문자열의 문자가 몇 번 눌러야 되는지 계산
        for (String s : keymap) {
            for (int i = 0; i < s.length(); i++) {
                char c = s.charAt(i); // 현재문자
                int press = i + 1; // 해당 문자를 누르기 위한 키 입력 횟수
                map.put(c, Math.min(map.getOrDefault(c, Integer.MAX_VALUE), press)); // 키에 해당하는 가장 작은 수 저장
            }
        }
        int[] answer = new int[targets.length];

        // 3. 각 target 문자열에 대해 계산
        for (int i = 0; i < targets.length; i++) {
            int sum = 0; // 총 누름 횟수
            boolean possible = true; // 문자열 완성 가능 여부

            // 4. target 문자열을 한 글자씩 검사
            for (char c : targets[i].toCharArray()) {
                if (!map.containsKey(c)) { // 해당 문자가 자판에 없으면 입력 불가
                    possible = false;
                    break;
                }

                sum += map.get(c); // 문자가 존재하면 최소 입력 횟수를 더함
            }

            // 5. 문자열을 만들 수 있으면 합계, 아니면 -1 저장
            answer[i] = possible ? sum : -1;
        }
        return answer;
    }
}
