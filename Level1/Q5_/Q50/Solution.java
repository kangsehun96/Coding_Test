package Level1.Q5_.Q50;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    public int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for (int i : nums) {
            set.add(i);
        }
        int answer = 0;
        if(set.size() < nums.length / 2) return set.size();
        else return nums.length / 2;
    }
}
