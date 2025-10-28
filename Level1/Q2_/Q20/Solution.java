package Level1.Q2_.Q20;

public class Solution {
    public String solution(String s) {
        if (s.length() % 2 == 0) {
            return s.substring(s.length() / 2 - 1, s.length() / 2 + 1);
        } else {
            return s.substring(s.length() / 2, s.length() / 2 + 1);
        }
    }
}
