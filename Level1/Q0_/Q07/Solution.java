package Level1.Q7;

public class Solution {
    public int solution(String s) {
        int answer = 0;

        // 문자열 s가 음수 부호(-)를 포함하고 있는 경우
        if (s.contains("-")) {
            // 첫 번째 문자를 제외한 나머지 숫자 부분만 추출
            String temp = s.substring(1);
            // 문자열을 정수로 변환 후 -1을 곱해 음수 반환
            // Integer.pasreInt()는 부호가 포함된 문자열도 자동으로 인식
            // 즉, pareInt("-123") -> -123으로 자동 처리
            return answer = Integer.parseInt(temp) * -1;

        // 문자열 s가 양수 부호(+)를 포함하고 있는 경우
        } else if (s.contains("+")) {
            String temp = s.substring(1);
            return answer = Integer.parseInt(temp);

        // 부호가 없는 일반 숫자 문자열의 경우
        } else {
            return answer = Integer.parseInt(s);
        }
    }
}
