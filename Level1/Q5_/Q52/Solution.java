package Level1.Q5_.Q52;

import java.time.*;

public class Solution {
    public String solution(int a, int b) {
        LocalDate date = LocalDate.of(2016, a, b);
        DayOfWeek dayOfWeek = date.getDayOfWeek();

        return dayOfWeek.toString().substring(0, 3);
    }
}
