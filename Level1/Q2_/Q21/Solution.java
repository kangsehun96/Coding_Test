package Level1.Q21;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int[] arr) {
        // 배열의 길이가 1이면, [-1]을 반환
        if (arr.length == 1) {
            return new int[]{-1};
        }

        // 1. 배열에서 최소값 찾기
        int min = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }

        // 2. 최소값이 아닌 원소들만 리스트에 추가
        List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            if (num != min) {
                list.add(num);
            }
        }

        // 리스트를 다시 int 배열로 변환
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
