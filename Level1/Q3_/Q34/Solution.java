package Level1.Q3_.Q34;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(int n) {
        List<Integer> list = new ArrayList<>();
        while (n > 0) {
            list.add(n % 3);
            n /= 3;
        }

        int answer = 0;
        for (int i = 0; i < list.size(); i++) {
            answer += list.get(i) * (int) Math.pow(3, list.size() - i - 1);
        }
        return answer;
    }
}
