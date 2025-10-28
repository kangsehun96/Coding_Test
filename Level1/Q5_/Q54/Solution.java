package Level1.Q5_.Q54;

public class Solution {
    public int solution(int n, int m, int[] section) {
        int count = 0;
        int i = 0;
        int len = section.length;

        while (i < len) {
            int start = section[i];
            count++;

            int end = start + m;

            while (i < len && section[i] < end) {
                i++;
            }
        }
        return count;
    }
}
