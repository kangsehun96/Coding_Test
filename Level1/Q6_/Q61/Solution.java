package Level1.Q6_.Q61;

public class Solution {

    boolean canGo(String[][] board, int y, int x) {
        if (y < 0 || y >= board.length) {
            return false;
        }
        if (x < 0 || x >= board[0].length) {
            return false;
        }

        return true;
    }
    public int solution(String[][] board, int y, int x) {
        int[] dy = {0, 1, -1, 0};
        int[] dx = {1, 0, 0, -1};
        int count = 0;

        String current = board[y][x];

        for (int i = 0; i < 4; i++) {
            int nextY = y + dy[i];
            int nextX = x + dx[i];
            if (canGo(board, nextY, nextX) && current.equals(board[nextY][nextX]))
                count++;
        }
        return count;
    }
}
