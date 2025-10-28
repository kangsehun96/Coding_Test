package Level1.Q2_.Q22;

public class Solution {
    public int solution(int[] a, int[] b) {
        int answer = 0;

        // 배열의 길이만큼 순회하며 각 인덱스 값 곱하기
        for (int i = 0; i < a.length; i++) {
            // a[i]와 b[i]를 곱해 누적
            answer += a[i] * b[i];
        }
        return answer;
    }
}
