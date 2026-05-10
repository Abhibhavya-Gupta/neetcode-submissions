class Solution {
    int[][] directions={{1,0},{0,-1},{0,1},{-1,0}};
    int[][] dp;
    public int longestIncreasingPath(int[][] matrix) {
        int m=matrix.length,n=matrix[0].length;
        dp=new int[m][n];
        for(int i=0;i<m;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        boolean[][] isvis=new boolean[m][n];
        int max=1;
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<n;j++)
            {
                if(!isvis[i][j])
                {
                    max=Math.max(max,dfs(matrix,i,j,isvis));
                }
            }   
        }
        return max;
    }
    int dfs(int[][] matrix,int i,int j,boolean[][] isvis)
    {
        int max=1;
        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
        for(int[] dir:directions)
        {
            int x=i+dir[0];
            int y=j+dir[1];
            if(x>=0 && y>=0 && x<matrix.length && y<matrix[0].length && matrix[x][y]>matrix[i][j])
            {
               max=Math.max(max,dfs(matrix,x,y,isvis)+1);
               isvis[i][j]=true;
            }
        }
        dp[i][j]=max;
        return max;
    }
}
