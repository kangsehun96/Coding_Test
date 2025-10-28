package Level1.Q2_.Q23;

public class Solution {
    public String solution(int n) {
        String answer = "";
        for (int i = 0; i < n; i++) {
            // i가 짝수이면 "수", 홀수이면 "박"을 answer에 추가
            answer += (i % 2 == 0) ? "수" : "박";
        }
        return answer;
    }
}
