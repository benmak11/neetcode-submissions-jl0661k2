class Solution {
    public int numEnclaves(int[][] grid) {
        int ROWS = grid.length, COLS = grid[0].length, res = 0;

        for (int r = 0; r < ROWS; r++) {
            for (int c = 0; c < COLS; c++) {
                if ((c == 0 || r == 0 || r == ROWS - 1 || c == COLS - 1) && grid[r][c] == 1)
                    dfs(grid, r, c, ROWS, COLS);
            }
        }

        for (int i = 0; i < ROWS; i++) {
            for (int j = 0; j < COLS; j++) {
                if (grid[i][j] == 1)
                    res++;
            }
        }

        return res;
    }

    private void dfs(int[][] grid, int r, int c, int ROWS, int COLS) {
        if (Math.min(r, c) < 0 || r >= ROWS || c >= COLS || grid[r][c] == 0)
            return;
        
        grid[r][c] = 0;

        dfs(grid, r + 1, c, ROWS, COLS);
        dfs(grid, r - 1, c, ROWS, COLS);
        dfs(grid, r, c + 1, ROWS, COLS);
        dfs(grid, r, c - 1, ROWS, COLS);
    }
}