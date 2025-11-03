package Level1.Q6_.Q69;

public class Solution {
    public String solution(String X, String Y) {
        int[] xCount = new int[10];
        int[] yCount = new int[10];

        for (char c : X.toCharArray()) {
            xCount[c - '0']++;
        }

        for (char c : Y.toCharArray()) {
            yCount[c - '0']++;
        }

        StringBuilder sb = new StringBuilder();
        for (int i = 9; i >= 0; i--) {
            sb.append(String.valueOf(i).repeat(Math.min(xCount[i], yCount[i])));
        }

        if(sb.isEmpty()) return "-1";
        if(sb.charAt(0) == '0') return "0";
        return sb.toString();
    }
}
