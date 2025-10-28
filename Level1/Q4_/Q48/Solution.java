package Level1.Q4_.Q48;

import java.util.*;

public class Solution {
    public int[] solution(String[] name, int[] yearning, String[][] photo) {
        Map<String, Integer> map = new HashMap<>();
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < name.length; i++) {
            map.put(name[i], yearning[i]);
        }

        for (int i = 0; i < photo.length; i++) {
            int temp = 0;
            for (int j = 0; j < photo[i].length; j++) {
                temp += map.getOrDefault(photo[i][j], 0);
            }
            list.add(temp);
        }
        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}
