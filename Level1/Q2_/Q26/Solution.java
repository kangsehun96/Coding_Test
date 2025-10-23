package Level1.Q2_.Q26;

public class Solution {
    public long solution(int price, int money, int count) {
        long sum = 0;

        // 1. 1회차부터 count회차까지 반복하여 누적 금액 계산
        for (int i = 0; i < count; i++) {
            sum += price * (i + 1);
        }
        // 현재 가진돈이 부족하지 않으면 0 반환
        // 부족하면 sum - money 반환
        return sum <= money ? 0 : sum - money;
    }
}
