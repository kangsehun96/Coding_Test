package Level1.Q5_.Q57;

public class Solution {
    public int solution(int n) {
        int answer = 0;

        // 1. 1부터 n까지 반복하며 소수인지 검사
        for (int i = 1; i <= n; i++) {
            if (isPrime(i)) {
                answer++;
            }
        }
        return answer;
    }

    // 2. 주어진 숫자가 소수인지 판별하는 메서드
    static boolean isPrime(int num) {
        if (num < 2) return false;
        if (num == 2) return true;
        if (num % 2 == 0) return false;

        int limit = (int) Math.sqrt(num);
        for (int i = 3; i <= limit; i += 2) {
            if (num % i == 0) return false;
        }
        return true;
    }
}
