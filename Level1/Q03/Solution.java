package Level1.Q3;

public class Solution {
    public String solution(int num) {
        // 2로 나누었을 경우 나머지가 0이면 Even 아니면 Odd 출력
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
}
