package Level1.Q5_.Q55;

import java.util.*;

public class Solution {
    public int solution(int k, int m, int[] score) {
        int count = score.length / m;
        int answer = 0;
        int[] scoreDesc = Arrays.stream(score)
                .boxed()
                .sorted(Comparator.reverseOrder())
                .mapToInt(Integer::intValue)
                .toArray();
        int[][] boxes = new int[count][m];
        for (int i = 0; i < count; i++) {
            for (int j = 0; j < m; j++) {
                boxes[i][j] = scoreDesc[i * m + j];
            }
        }
        for (int[] box : boxes) {
            answer += box[m - 1] * m;
        }
        return answer;
    }
}
