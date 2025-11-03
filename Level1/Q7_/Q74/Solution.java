package Level1.Q7_.Q74;

public class Solution {
    public String solution(String new_id) {

        // 1. 모든 대문자 소문자 치환
        String answer = new_id.toLowerCase();

        // 2. 소문자, 숫자, '-', '_', '.' 를 제외한 모든 문자 제거
        answer = answer.replaceAll("[^a-z0-9._-]", "");

        // 3. 마침표(.)가 2번 이상 연속된 부분을 하나의 '.'로 변경
        answer = answer.replaceAll("\\.{2,}", ".");

        // 4. 마침표가 처음이나 끝에 위치하면 제거
        answer = answer.replaceAll("^\\.|\\.$", "");

        // 5. 빈 문자열이면 "a"를 대입
        if(answer.isEmpty()) answer = "a";

        // 6. 16자 이상이면 15자만 남김
        // 자른 뒤 끝에 '.'이 남아있으면 제거
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
            answer = answer.replaceAll("\\.$", "");
        }

        // 7. 길이가 2자 이하면 마지막 문자를 반복해서 길이가 3이 될깨까지 추가
        while (answer.length() < 3) {
            answer += answer.charAt(answer.length() - 1);
        }

        return answer;
    }
}
