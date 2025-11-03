package Level3.Q0_.Q01;

class Solution {
    public int solution(int n, int[][] computers) {
        boolean[] visited = new boolean[n];
        int networkCount = 0;

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(visited, computers, i);
                networkCount++;
            }
        }
        return networkCount;
    }

    void dfs(boolean[] visited, int[][] computers, int current) {
        visited[current] = true;

        for (int i = 0; i < computers.length; i++) {
            if (!visited[i] && computers[current][i] == 1) {
                dfs(visited, computers, i);
            }
        }
    }
}