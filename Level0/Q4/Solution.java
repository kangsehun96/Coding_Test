package Level0.Q4;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;

        for (String s : babbling) {
            s = s.replace("aya", " ").replace("ye", " ")
                    .replace("woo", " ").replace("ma", " ");

            if (s.isBlank()) {
                answer++;
            }
        }
        return answer;
    }
}