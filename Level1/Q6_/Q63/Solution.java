package Level1.Q6_.Q63;

public class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int minCount = 0; // 실제로 맞춘 번호
        int zeroCount = 0; // 알아볼 수 없는 번호

        // 1. 내 로또 번호 중 당첨 번호와 일치하는 개수를 센다.
        for (int lotto : lottos) {
            for (int winNum : win_nums) {
                if (lotto == winNum) {
                    minCount++;
                }
            }
        }

        // 2. 0의 개수를 센다.
        for (int lotto : lottos) {
            if (lotto == 0) {
                zeroCount++;
            }
        }

        return new int[]{rank(minCount + zeroCount), rank(minCount)};
    }

    // 3. 맞춘 개수에 따른 순위 반환 메서드
    int rank(int Count) {
        return Count < 2 ? 6 : 7 - Count;
    }
}
