package Level1.Q5;

public class Solution {
    // x부터 시작해 x씩 증가하는 숫자를 n개 담은 배열을 반환하는 메서드
    public long[] solution(int x, int n) {
        // 결과를 담을 배열 생성
        long[] answer = new long[n];

        // x의 배수를 순서대로 저장
        for (int i = 0; i < n; i++) {
            answer[i] = x * (long)(i+1);
        }
        return answer;
    }
}
