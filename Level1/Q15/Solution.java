package Level1.Q15;

public class Solution {
    public int solution(int[] numbers) {
        int sumA = 10 * 9 / 2;
        int sumB = 0;

        for (int number : numbers) {
            sumB += number;
        }
        return sumA - sumB;
    }
}
