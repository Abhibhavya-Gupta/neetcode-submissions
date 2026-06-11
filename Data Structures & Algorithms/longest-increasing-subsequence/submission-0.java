class Solution {
    int[] dp;
    public int lengthOfLIS(int[] nums) {
        dp= new int[nums.length];
        Arrays.fill(dp,1);
        for(int i=nums.length-1;i>=0;i--)
        {
            for(int j=i+1;j<nums.length;j++)
            {
                if(nums[i]<nums[j]){
                    dp[i]=Math.max(dp[i],1+dp[j]);
                }
            }
        }
        int res=0;
        for(int r:dp)
        {
            res=Math.max(res,r);
        }
        return res;
    }
    int dfs(int i,int[] nums,int next)
    {
        if(i>=nums.length)
        {
            return 0;
        }
        if(dp[i]!=-1)
        {
            return dp[i];
        }
        int ans=1;
        for(int t=i;t<nums.length;t++)
        {
            if(nums[t]<next)
            ans=Math.max(ans,dfs(t+1,nums,nums[t])+1);
        }
        dp[i]=ans;
        return dp[i];
    }
}