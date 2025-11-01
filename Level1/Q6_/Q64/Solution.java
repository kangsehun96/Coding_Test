package Level1.Q6_.Q64;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int solution(String s) {
        int current = 0; // 현재 탐색중인 인덱스
        int startNum = 0; // 분리 구간 시작 인덱스
        char startChar = s.charAt(startNum); // 현재 구간 기준 문자
        List<String> list = new ArrayList<>(); // 분리된 문자열 조각을 담는 리스트
        int xCount = 0; // 기준 문자와 같은 문자 개수
        int otherCount = 0; // 기준 문자와 다른 문자 개수

        // 1. 문자열 전체를 순회하면 구간을 나눔
        while (current < s.length()) {

            // 2. 현재 문자가 기준 문자와 같으면 xCount 증가, 다르면 otherCount 증가
            if (startChar == s.charAt(current)) {
                xCount++;
            } else {
                otherCount++;
            }
            current++;

            // 기준 문자 수와 다른 문자 수가 같아지는 순간 문자열 분리
            if (xCount == otherCount) {
                list.add(s.substring(startNum, current));
                startNum = current;
                if (startNum < s.length()) {
                    startChar = s.charAt(startNum);
                }
                xCount = 0;
                otherCount = 0;
            }
        }

        // 마지막 구간이 남아 있다면 리스트에 추가
        if (startNum < s.length()) {
            list.add(s.substring(startNum));
        }
        return list.size();
    }

}
