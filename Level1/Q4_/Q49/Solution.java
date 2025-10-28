package Level1.Q4_.Q49;

public class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        int[][] code1 = new int[n][n];
        int[][] code2 = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                code1[i][j] = arr1[i] % 2;
                arr1[i] /= 2;
            }

            for (int j = n - 1; j >= 0; j--) {
                code2[i][j] = arr2[i] % 2;
                arr2[i] /= 2;
            }
        }
        String[] answer = new String[n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (code1[i][j] == 1 || code2[i][j] == 1) {
                    answer[i] = (answer[i] == null ? "" : answer[i]) + "#";
                } else {
                    answer[i] = (answer[i] == null ? "" : answer[i]) + " ";
                }
            }
        }
        return answer;
    }
}
