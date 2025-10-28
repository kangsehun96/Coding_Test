package Level1.Q2_.Q25;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    public String solution(String s) {
        // 문자열을 Character 배열로 변환
        Character[] charArr = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            charArr[i] = s.charAt(i);
        }

        // 내림차순 정렬
        Arrays.sort(charArr, Collections.reverseOrder());

        // 정렬된 문자들을 합쳐서 문자열 생성
        StringBuilder sb = new StringBuilder();
        for (char c : charArr) {
            sb.append(c);
        }
        return sb.toString();
    }
}
