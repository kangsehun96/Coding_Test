package Level1.Q2_.Q28;

public class Solution {
    public int[][] solution(int[][] arr1, int[][] arr2) {
        int rows = arr1.length; // 행 개수
        int cols = arr1[0].length; // 열 개수

        int[][] answer = new int[rows][cols];

        // 1. 행 순회
        for (int i = 0; i < rows; i++) {
            // 2. 열 순회
            for (int j = 0; j < cols; j++) {
                // 3. 해당 위치에 더한 원소 넣기
                answer[i][j] = arr1[i][j] + arr1[i][j];
            }
        }
        return answer;
    }
}
