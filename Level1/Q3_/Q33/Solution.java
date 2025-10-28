package Level1.Q3_.Q33;

import java.util.Arrays;

public class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int count = 0;
        for (int i = 0; i < d.length; i++) {
            budget -= d[i];
            if(budget < i) break;
            count++;
        }
        return count;
    }
}
