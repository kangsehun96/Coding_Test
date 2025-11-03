package Level1.Q7_.Q77;

import java.util.*;

public class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = 0;
        int n = schedules.length;

        for (int i = 0; i < n; i++) {
            // 희망 출근 시각 +10분 계산
            int base = schedules[i];
            int h = base / 100;
            int m = base % 100;
            m += 10;
            if (m >= 60) {
                h += 1;
                m -= 60;
            }
            int allowedTime = h * 100 + m;

            boolean ok = true;
            int day = startday; // 1=월 … 7=일

            for (int j = 0; j < 7; j++) {
                // 토요일(6) 또는 일요일(7)은 지각 체크 대상 아님
                if (day == 6 || day == 7) {
                    // 주말인 날은 출근 체크 없이 건너뜀
                } else {
                    if (timelogs[i][j] > allowedTime) {
                        ok = false;
                        break;
                    }
                }
                // 다음 요일로
                day++;
                if (day > 7) {
                    day = 1;
                }
            }

            if (ok) {
                answer++;
            }
        }

        return answer;
    }
}
