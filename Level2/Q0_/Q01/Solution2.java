package Level2.Q0_.Q01;

import java.util.LinkedList;
import java.util.Queue;

public class Solution2 {
    public int solution(int[] numbers, int target) {
        int answer = 0;

        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{0, 0}); // 현재 합, 인덱스

        while (!queue.isEmpty()) {
            int[] current = queue.poll();
            int sum = current[0];
            int index = current[1];

            if (index == numbers.length) {
                if(sum == target) answer++;
                continue;
            }

            queue.add(new int[]{sum + numbers[index], index + 1});
            queue.add(new int[]{sum - numbers[index], index + 1});
        }
        return answer;
    }
}
