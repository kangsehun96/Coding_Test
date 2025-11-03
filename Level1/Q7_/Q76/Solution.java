package Level1.Q7_.Q76;

import java.util.*;

public class Solution {
    public int[] solution(String today, String[] terms, String[] privacies) {

        int todayDays = toDays(today);

        Map<String, Integer> termMap = new HashMap<>();
        for (String t : terms) {
            String[] parts = t.split(" ");
            termMap.put(parts[0], Integer.parseInt(parts[1]));
        }

        List<Integer> result = new ArrayList<>();
        for (int i = 0; i < privacies.length; i++) {
            String[] p = privacies[i].split(" ");
            String date = p[0];
            String termCode = p[1];

            int termMonths = termMap.get(termCode);

            int collectDays = toDays(date);
            int expiryDays = collectDays + termMonths * 28 -1;

            if (expiryDays < todayDays) {
                result.add(i + 1);
            }
        }

        return result.stream().mapToInt(Integer::intValue).toArray();
    }

    private int toDays(String date) {
        String[] d = date.split("\\.");
        int y = Integer.parseInt(d[0]);
        int m = Integer.parseInt(d[1]);
        int day = Integer.parseInt(d[2]);

        return (y * 12 + m) * 28 + day;
    }
}
