class Solution {
    int[][] dp;
    public int lastStoneWeightII(int[] stones) {
        int n=stones.length;
        int sum=0;
        for(int num:stones)
        {
            sum+=num;
        }
        int target=(sum+1)/2;
        dp=new int[n][target];
        for(int[] row:dp) Arrays.fill(row,-1);

        return dfs(0,0,stones,sum,target);
    }
    int dfs(int i,int total,int[] stones,int sum,int target)
    {
       if(total>=target || i==stones.length)
       {
        return Math.abs(2*total - sum);
       } 
       if(dp[i][total]!=-1)
       {
        return dp[i][total];
       }
        dp[i][total]=Math.min(
        dfs(i+1,total,stones,sum,target),
        dfs(i+1,total+stones[i],stones,sum,target)
       );
       return dp[i][total];
    }

}