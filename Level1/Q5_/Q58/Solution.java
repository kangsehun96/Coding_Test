package Level1.Q5_.Q58;

public class Solution {
    public int solution(String[] babbling) {
        String[] can = {"aya", "ye", "woo", "ma"};
        int answer = 0;

        // 1. babbling 배열 단어 검사
        for (String b : babbling) {
            String temp = b;
            String prev = "";
            boolean valid = true;

            // 2. 문자가 남아 있는 동안 반복
            while (!temp.isEmpty()) {
                boolean found = false;

                // 3. 가능한 배열 순회
                for (String c : can) {
                    if (temp.startsWith(c) && !c.equals(prev)) {
                        temp = temp.replaceFirst(c, "");
                        prev = c;
                        found = true;
                        break;
                    }
                }

                // 4. 할 수 없는 발음이거나 연속된 발음일 경우
                if (!found) {
                    valid = false;
                    break;
                }
            }

            // 5. valid면 카운트 증가
            if(valid) answer++;
        }
        return  answer;
    }
}
