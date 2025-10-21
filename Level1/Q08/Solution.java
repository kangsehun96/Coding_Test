package Level1.Q8;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // i를 1부터 루트 n 까지 확인
        for (int i = 1; i * i <= n; i++) {
            if (n % i == 0) { // i가 약수인 경우
                answer += i; // i 더하기
                if (i != n / i) { // 중복 방지 (ex : 4 * 4 = 16)
                    answer += n / i; // 짝 약수도 도하기
                }
            }
        }
        return  answer;
    }
}
