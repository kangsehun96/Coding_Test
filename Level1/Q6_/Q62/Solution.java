package Level1.Q6_.Q62;

public class Solution {
    public int solution(String dartResult) {
        int[] scores = new int[3];
        int index = -1;
        int i = 0;

        // 1. 문자열을 순회
        while (i < dartResult.length()) {
            char c = dartResult.charAt(i);

            // 2. 숫자 처리
            if (Character.isDigit(c)) {
                index++;

                // 숫자가 10인지 확인
                if (c == '1' && i + 1 < dartResult.length() && dartResult.charAt(i + 1) == '0') {
                    scores[index] = 10;
                    i++;
                } else {
                    scores[index] = c - '0';
                }
            // 3. 보너스 처리
            } else if (c == 'S') {
                scores[index] = (int) Math.pow(scores[index], 1);
            } else if (c == 'D') {
                scores[index] = (int) Math.pow(scores[index], 2);
            } else if (c == 'T') {
                scores[index] = (int) Math.pow(scores[index], 3);
            // 4. 옵션 처리
            } else if (c == '*') {
                scores[index] *= 2;
                if (index > 0) {
                    scores[index - 1] *= 2;
                }
            } else if (c == '#') {
                scores[index] *= -1;
            }

            i++;
        }
        int total = 0;
        for (int s : scores) {
            total += s;
        }
        return total;

    }
}
