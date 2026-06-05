class Solution {
    int[][] dp;
    public int minPathSum(int[][] grid) {
        int m=grid.length,n=grid[0].length;
        dp=new int[m][n];
        for(int[] row:dp)
        {
            Arrays.fill(row,-1);
        }
        dp[m-1][n-1]=grid[m-1][n-1];
        helper(0,0,grid);
        return dp[0][0];
    }
    int helper(int i,int j,int[][] grid)
    {
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        int down=201,right=201;
        if(i+1<grid.length) down=helper(i+1,j,grid);
        if(j+1<grid[0].length) right=helper(i,j+1,grid);
        dp[i][j]=grid[i][j]+Math.min(down,right);
        return dp[i][j];
    }
}