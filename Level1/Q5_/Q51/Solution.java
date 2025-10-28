package Level1.Q5_.Q51;

public class Solution {
    public int solution(int number, int limit, int power) {
        int[] n = new int[number];
        int answer = 0;
        for (int i = 1; i <= number; i++) {
            int count = 0;
            for (int j = 1; j * j <= i; j++) {
                if (i % j == 0) {
                    if (j * j == i) count++;
                    else count += 2;
                }
            }
            n[i - 1] = count;
            if(count <= limit) answer += count;
            else answer += power;
        }
        return answer;
    }
}
