package Level0.Q5;

public class Solution {

    // 방향을 정하는 enum
    enum Direction {
        RIGHT, DOWN, UP, LEFT
    }

    // x, y 축으로 범위를 넘거나 해당 위치에 값이 있다면 false를 반환
    // 그렇지 않다면 true
    static boolean canGo(int y, int x, int n, int[][] value) {
        if (y < 0 || y >= n) {
            return false;
        }
        if (x < 0 || x >= n) {
            return false;
        }
        if (value[y][x] == 0) {
            return false;
        }
        return true;
    }

    static int[][] setValue(int n) {
        int y = 0;
        int x = 0;
        int num = 1;
        Direction dir = Direction.RIGHT;

        int[][] value = new int[n][n];

        // 좌표 변경을 위한 값
        int[] dy = {0, -1, 0, 1};
        int[] dx = {1, 0, -1, 0};

        while (true) {
            value[y][x] = num;

            if (num == n * n) {
                break;
            }

            // 다음 좌표 변경
            int nextY = y + dy[dir.ordinal()];
            int nextX = x + dx[dir.ordinal()];

            // 다음 좌표로 갈 수 있는 지 여부 확인
            if (canGo(nextY, nextX, n, value)) {
                y = nextY;
                x = nextX;
                num++;
            } else {
                dir = Direction.values()[(dir.ordinal() + 1) % 4];
            }
        }
        return value;
    }

    public static int[][] solution(int n) {
        return setValue(n);
    }
}
