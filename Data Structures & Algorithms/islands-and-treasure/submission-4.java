class Solution {
    public void islandsAndTreasure(int[][] grid) {
        Queue<int[]> q = new ArrayDeque<>();
        for (int r = 0; r < grid.length; r++) {
            for (int c = 0; c < grid[0].length; c++) {
                if (grid[r][c] == 0) {
                    q.offer(new int[]{r, c});
                }
            }
        }
        
        int[][] directions = {{0, 1}, {0, -1}, {1, 0}, {-1, 0}};
        while (!q.isEmpty()) {
            int[] curr = q.poll();
            int r2 = curr[0];
            int c2 = curr[1];

            for (int[] dir : directions) {
                int nr = r2 + dir[0];
                int nc = c2 + dir[1];

                if (nr >= 0 && nr < grid.length && nc >= 0 && nc < grid[0].length && grid[nr][nc] == 2147483647) {
                    grid[nr][nc] = grid[r2][c2] + 1;
                    q.offer(new int[]{nr, nc});
                }
            }
        }
    }
}