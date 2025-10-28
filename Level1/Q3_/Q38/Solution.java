package Level1.Q3_.Q38;

public class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        char[] c = s.toCharArray();
        answer[0] = -1;
        for (int i = 1; i < c.length; i++) {
            int prev = i - 1;
            while (prev >= 0) {
                if (c[prev] == c[i]) {
                    answer[i] = i - prev;
                    break;
                } else {
                    answer[i] = -1;
                }
                prev--;
            }
        }
        return answer;
    }
}
