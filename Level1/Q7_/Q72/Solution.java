package Level1.Q7_.Q72;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public String solution(String[] survey, int[] choices) {
        Map<Character, Integer> map = new HashMap<>();

        // 1. 문제에 주어진 8가지 성격 지표 초기화
        map.put('R', 0);
        map.put('T', 0);
        map.put('C', 0);
        map.put('F', 0);
        map.put('J', 0);
        map.put('M', 0);
        map.put('A', 0);
        map.put('N', 0);

        // 2. 설문 결과와 선택을 순회
        for (int i = 0; i < survey.length; i++) {
            if (choices[i] < 4) // 4보다 작으면 왼쪽 유형 점수 추가
                map.put(survey[i].charAt(0), map.get(survey[i].charAt(0)) + 4 - choices[i]);
            else if (choices[i] > 4) // 4보다 크면 오른쪽 유형 점수 추가
                map.put(survey[i].charAt(1), map.get(survey[i].charAt(1)) + choices[i] - 4);
        }

        StringBuilder sb = new StringBuilder();

        // 3 각 지표 별로 점수 비교 후 높은 쪽 선택
        if (map.get('R') >= map.get('T')) sb.append('R');
        else sb.append('T');

        if (map.get('C') >= map.get('F')) sb.append('C');
        else sb.append('F');

        if (map.get('J') >= map.get('M')) sb.append('J');
        else sb.append('M');

        if (map.get('A') >= map.get('N')) sb.append('A');
        else sb.append('N');

        return sb.toString();
    }
}
