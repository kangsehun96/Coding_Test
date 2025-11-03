package Level1.Q7_.Q73;

import java.util.List;

public class Solution {
    public String solution(int[] numbers, String hand) {

        // 1. 키패드 각 숫자에 해당하는 좌표 저장
        int[][] keyPad = {{3, 1}, // 0번
                {0, 0}, {0, 1}, {0, 2}, // 1, 2, 3번
                {1, 0}, {1, 1}, {1, 2}, // 4, 5, 6번
                {2, 0}, {2, 1}, {2, 2}}; // 7, 8, 9번

        int[] left = {3, 0}; // 왼손 초기 위치 '*'
        int[] right = {3, 2}; // 오른손 초기 위치 '#'

        // 2. 입력된 숫자들 순서대로 확인
        StringBuilder answer = new StringBuilder();
        for (int n : numbers) {
            if (n == 1 || n == 4 || n == 7) { // 왼손 전용
                answer.append("L");
                left = keyPad[n];
            } else if (n == 3 || n == 6 || n == 9) { // 오른손 전용
                answer.append("R");
                right = keyPad[n];
                // 2, 5, 8, 0 가까운 손으로 결정
            } else {
                int leftDistance = Math.abs(left[0] - keyPad[n][0]) + Math.abs(left[1] - keyPad[n][1]);
                int rightDistance = Math.abs(right[0] - keyPad[n][0]) + Math.abs(right[1] - keyPad[n][1]);

                if (leftDistance < rightDistance) {
                    answer.append("L");
                    left = keyPad[n];
                } else if (rightDistance < leftDistance) {
                    answer.append("R");
                    right = keyPad[n];
                    // 거리가 같은 경우 주 손 기준 선택
                } else {
                    if (hand.equals("left")) {
                        answer.append("L");
                        left = keyPad[n];
                    } else {
                        answer.append("R");
                        right = keyPad[n];
                    }
                }
            }
        }
        return answer.toString();
    }
}
