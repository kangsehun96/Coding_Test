package Level1.Q4_.Q41;

public class Solution {
    public String solution(int[] food) {
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < food.length; i++) {
            for (int j = 0; j < food[i] / 2; j++) {
                sb.append(i);
            }
        }
        String answer = sb + "0";

        return answer + sb.reverse();
    }
}
