package Level1.Q2;

import java.util.*;

public class Solution {
    public int[] solution(long n) {
        // 리스트 생성
        List<Integer> list = new ArrayList<>();

        // 리스트에 일의 자리부터 역순으로 저장
        while (n > 0) {
            list.add((int) (n % 10));
            n /= 10;
        }

        // 리스트의 요소를 배열에 저장
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
