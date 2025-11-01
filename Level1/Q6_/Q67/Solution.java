package Level1.Q6_.Q67;

import java.util.Arrays;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) {

        Arrays.sort(lost);
        Arrays.sort(reserve);
        int l = 0;
        while (l < lost.length) {
            for (int r = 0; r < reserve.length; r++) {
                if (lost[l] == reserve[r]) {
                    lost[l] = -1;
                    reserve[r] = -1;
                    break;
                }
            }
            l++;
        }

        for (int i = 0; i < lost.length; i++) {
            if(lost[i] == -1) continue;
            for (int j = 0; j < reserve.length; j++) {
                if(reserve[j] == -1) continue;
                if (reserve[j] == lost[i] - 1 || reserve[j] == lost[i] + 1) {
                    reserve[j] = -1;
                    lost[i] = -1;
                    break;
                }
            }
        }

        int count = 0;
        for (int j : lost) {
            if (j == -1) count++;
        }

        return n - lost.length + count;
    }
}
