package Level1.Q5_.Q53;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] answers) {
        int[] number1 = {1, 2, 3, 4, 5};
        int[] number2 = {2, 1, 2, 3, 2, 4, 2, 5};
        int[] number3 = {3, 3, 1, 1, 2, 2, 4, 4, 5, 5};
        int[] count = new int[3];
        int[][] numbers = {number1, number2, number3};

        for (int i = 0; i < numbers.length; i++) {
            count[i] = addCount(numbers[i], answers);
        }
        List<Integer> list = new ArrayList<>();
        int max = Math.max(count[0], Math.max(count[1], count[2]));

        for (int i = 0; i < 3; i++) {
            if(count[i] == max) list.add(i + 1);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }

    int addCount(int[] number, int[] answer) {
        int temp = 0;
        for (int i = 0; i < answer.length; i++) {
            if (answer[i] == number[i % number.length]) {
                temp++;
            }
        }
        return temp;
    }
}
