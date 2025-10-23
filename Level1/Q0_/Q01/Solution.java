package Level1.Q1;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        while (n > 0) {
            // n의 일의 자리 숫자를 answer에 더합니다.
            answer += n % 10;
            // 다음 반복이 시행될 때 다음 자리(일의 자리 수를 더했으면 십의 자리 수) 수가
            // 올 수 있도록 n을 변경합니다.
            n /= 10;
        }

        return answer;
    }
}
