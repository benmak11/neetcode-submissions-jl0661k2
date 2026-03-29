class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n = isConnected.length, res = 0;

        boolean[] visited = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (!visited[i]) {
                dfs(isConnected, visited, i, n);
                res++;
            }
        }
        return res;
    }

    private void dfs(int[][] isConnected, boolean[] visited, int node, int n) {
        visited[node] = true;
        for (int j = 0; j < n; j++) {
            if (j != node && isConnected[node][j] == 1 && !visited[j])
                dfs(isConnected, visited, j, n);
        }
    }
}