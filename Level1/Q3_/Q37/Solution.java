package Level1.Q3_.Q37;

public class Solution {
    public int solution(int[][] sizes) {
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > sizes[i][1]) {
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int larW = 0;
        int larH = 0;
        for (int i = 0; i < sizes.length; i++) {
            if (sizes[i][0] > larW)
                larW = sizes[i][0];

            if (sizes[i][1] > larH)
                larH = sizes[i][1];
        }
        return larW * larH;
    }
}

