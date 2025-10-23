package Level1.Q6;

public class Solution {
    public int solution(int n) {
        // x는 2부터 시작
        for (int x = 2; x < n; x++) {
            if (n % x == 1) {
                return x; // 가장 작은 x를 찾으면 반환
            }
        }
        // 해당 return은 쓰이지 않음
        return n - 1;
    }
}
