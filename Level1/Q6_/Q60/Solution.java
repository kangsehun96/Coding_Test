package Level1.Q6_.Q60;

public class Solution {
    public String solution(String s, String skip, int index) {
        StringBuilder sb = new StringBuilder();
        boolean[] skipCheck = new boolean[26];

        // 1. skip문자열에 포함된 문자 해당 문자는 건너뜀
        for (char c : skip.toCharArray()) {
            skipCheck[c - 'a'] = true;
        }

        for (char c : s.toCharArray()) {
            int count = 0;
            char cur = c;

            // 2. index만큼 반복 단, skip에 포함된 문자는 세지 않음
            while (count < index) {
                cur++; // 다음 알파벳 이동
                if(cur > 'z') cur = 'a'; // 'z'를 넘어가면 다시 'a'로 순환
                if (!skipCheck[cur - 'a']) {
                    count++;
                }
            }
            sb.append(cur);
        }
        return sb.toString();
    }
}
