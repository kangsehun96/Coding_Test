package Level1.Q10;

public class Solution {
    // 하샤드 수인지 확인하는 메서드
    // 하샤드 수 : n이 각 자릿수의 합으로 나누어 떨이지는 수
    public boolean solution(int x) {
        int sum = 0; // 각 자릿수 합을 저장할 변수

        // 1. 숫자를 문자열로 변환 -> 각 자릿수 접근 가능
        String s = String.valueOf(x);

        // 2. 문자열을 char 배열로 변환
        char[] digits = s.toCharArray();

        // 3. 각 자릿수를 합산
        for (char digit : digits) {
            sum += digit - '0'; // char -> int 변환
        }

        // 4. 원래 숫자가 자릿수 합으로 나누어 떨어지는 지 확인
        return x % sum == 0;
    }
}
