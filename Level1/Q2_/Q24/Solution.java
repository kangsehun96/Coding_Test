package Level1.Q2_.Q24;

public class Solution {
    public int solution(int left, int right) {
        int answer = 0;

        // left부터 right까지 순회
        for (int i = left; i <= right; i++) {
            // Math.sqrt(i) 제곱근 계산
            // 제곱수인지 확인
            // true면 약수 개수 홀수 -> i를 빼고, false면 약수 개수가 짝수 -> i를 더함
            answer += ((int) Math.sqrt(i) * (int) Math.sqrt(i) == i ? -i : i);
        }
        return answer;
    }
}

