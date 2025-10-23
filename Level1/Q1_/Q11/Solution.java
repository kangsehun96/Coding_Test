package Level1.Q11;

public class Solution {
    public long solution(long n) {
        return isSquare(n) ? (long) Math.pow((long) Math.sqrt(n) + 1, 2) : -1;
    }

    public boolean isSquare(long n) {
        long temp = (long) Math.sqrt(n);
        return temp * temp == n;
    }
}
