package Level1.Q3_.Q39;

public class Solution {
    public String solution(String s, int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                sb.append((char) ('A' + (c - 'A' + n) % 26));
            } else if (c >= 'a' && c <= 'z') { // 소문자
                sb.append((char) ('a' + (c - 'a' + n) % 26));
            } else { // 공백이나 기타 문자
                sb.append(c);
            }
        }
        return sb.toString();
    }
}
