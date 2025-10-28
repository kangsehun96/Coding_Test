package Level1.Q5_.Q52;

public class Solution2 {
    public String solution(int a, int b) {
        int[] daysInMonth = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

        String[] week = {"SUN", "MON", "TUE", "WED", "THU", "FRI", "SAT"};

        int totalDays = 0;
        for (int i = 0; i < a - 1; i++) {
            totalDays += daysInMonth[i];
        }
        totalDays += b;

        int dayIndex = (5 + totalDays - 1) % 7;
        return week[dayIndex];
    }
}
