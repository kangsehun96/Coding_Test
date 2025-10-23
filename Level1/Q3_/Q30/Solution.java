package Level1.Q3_.Q30;

import java.util.*;

public class Solution {
    public int[] solution(int[] arr) {
        List<Integer> list = new ArrayList<>();

        // 1. 이전 값 저장 변수, 0 ~ 9 이므로 -1 저장
        int prev = -1;

        // 2. 배열 순회
        for (int num : arr) {
            if (num != prev) {
                list.add(num);
                prev = num;
            }
        }

        // 3. List를 int[] 로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }
        return answer;
    }
}
