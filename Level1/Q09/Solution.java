package Level1.Q9;

import java.util.*;

public class Solution {
    // n의 각 자릿수를 큰 것부터 작은 순으로 정렬한 정수 반환
    public long solution(long n) {
        // 1. 숫자를 문자열 변환
        String s = String.valueOf(n);

        // 2. 문자열을 Character 배열로 변환
        // Array.sort에서 Comparator를 쓰려면 기본형이 아닌 Character형이어야 함
        Character[] digits = new Character[s.length()];
        for (int i = 0; i < s.length(); i++) {
            digits[i] = s.charAt(i);
        }

        // 3. 내림차순 정렬
        // Collections.reversorder()를 사용
        Arrays.sort(digits, Collections.reverseOrder());

        // 정렬된 Character 배열을 다시 문자열로 합침
        StringBuilder sb = new StringBuilder();
        for (char c : digits) {
            sb.append(c);
        }

        // 5. 문자열을 Long 타입으로 변환하여 반환
        return Long.parseLong(sb.toString());
    }
}
