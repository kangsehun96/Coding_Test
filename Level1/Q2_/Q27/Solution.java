package Level1.Q2_.Q27;

public class Solution {
    public boolean solution(String s) {
        // 1. matches() 메서드를 사용하여 정규식 검사
        // 숫자 4자리 또는 숫자 6자리
        return s.matches("^(\\d{4}|\\d{6})$");
    }
}
