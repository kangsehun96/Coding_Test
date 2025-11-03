package Level1.Q7_.Q71;

import java.util.Stack;

public class Solution {
    public int solution(int[][] board, int[] moves) {
        Stack<Integer> stack = new Stack<>();
        int answer = 0;
        for (int i : moves) {
            for (int j = 0; j < board.length; j++) {
                if (board[j][i - 1] != 0) {
                    stack.add(board[j][i - 1]);
                    board[j][i - 1] = 0;
                    break;
                }
            }

            if (stack.size() >= 2) {
                if (stack.get(stack.size() - 1) == stack.get(stack.size() - 2)) {
                    stack.pop();
                    stack.pop();
                    answer += 2;
                }
            }
        }
        return answer;
    }
}
