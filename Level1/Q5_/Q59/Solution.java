package Level1.Q5_.Q59;

import java.util.*;

public class Solution {

    // 1. 스테이지 번호와 실패율을 저장하기 위한 내부 클래스
    static class Stage {
        int stage;
        double failRate;

        public Stage(int stage, double failRate) {
            this.stage = stage;
            this.failRate = failRate;
        }
    }

    public int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int totalPlayers = stages.length;
        List<Stage> list = new ArrayList<>();

        // 2. 1번부터 N번까지 각 스테이지 실패율 계산
        for (int i = 1; i <= N; i++) {
            int failCount = 0;

            // 3. 플레이어가 어느 스테이지에 멈춰 있는지 확인
            for (int s : stages) {
                if (s == i) failCount++;
            }

            // 4. 실패율 계산
            double failRate = totalPlayers == 0 ? 0 : (double) failCount / totalPlayers;
            list.add(new Stage(i, failRate));

            totalPlayers -= failCount;
        }

        // 5. 실패율 내림차순 정렬
        list.sort((a, b) -> {
            if (b.failRate != a.failRate) {
                return Double.compare(b.failRate, a.failRate);
            } else {
                return Integer.compare(a.stage, b.stage);
            }
        });

        for (int i = 0; i < N; i++) {
            answer[i] = list.get(i).stage;
        }

        return answer;

    }
}
