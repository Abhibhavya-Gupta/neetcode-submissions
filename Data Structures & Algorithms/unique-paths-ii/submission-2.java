class Solution {
    int[][] dp;
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m=obstacleGrid.length,n=m=obstacleGrid[0].length;
        dp=new int[m][n];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        return helper(0,0,obstacleGrid);
    }
    int helper(int i,int j,int[][] maze)
    {
        if(i==maze.length-1 && j==maze[0].length-1 && maze[i][j]!=1)
        {
            return 1;
        }
        if(i==maze.length || j==maze[0].length ||maze[i][j]==1 )
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int down=helper(i+1,j,maze);
        int right=helper(i,j+1,maze);
        dp[i][j]=down+right;
        return dp[i][j];

    }
}