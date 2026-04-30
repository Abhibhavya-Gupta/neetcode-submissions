class Solution {
    int[][] dp;
    public int uniquePaths(int m, int n) {
        dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        return helper(0,0,m,n);
    }
    int helper(int i,int j,int r,int c)
    {
        if(i==r-1 || j==c-1)
        {
            dp[i][j]=1;
            return 1;
        }
        if(i>=r || j>=c)
        {
            return 0;
        }
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        dp[i][j] = helper(i+1,j,r,c) + helper(i,j+1,r,c);
        return dp[i][j];

    }
}
