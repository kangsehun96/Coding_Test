package Level1.Q4;

public class Solution {
    // 주어진 정수 배열 평균값 구하는 메서드
    public double solution(int[] arr) {
        double answer = 0; // 합계를 저장할 변수

        // 배열의 모든 요소 순회하며 합계 구함
        for (int i : arr) {
            answer += i;
        }

        // 전체 합계를 배열의 길이로 나누어 평균 계산
        return answer / arr.length;
    }
}
