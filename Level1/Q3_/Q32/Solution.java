package Level1.Q3_.Q32;

public class Solution {
    public int solution(String t, String p) {
        int count = 0;

        for (int i = 0; i <= t.length() - p.length(); i++) {
            String sub = t.substring(i, i + p.length());
            int numT = Integer.parseInt(sub);
            int numP = Integer.parseInt(p);

            if (numT <= numP) count++;

        }
        return count;
    }
}
