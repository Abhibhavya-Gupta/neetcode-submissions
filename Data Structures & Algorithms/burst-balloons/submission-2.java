class Solution {
    int[][] dp;
    public int maxCoins(int[] nums) {
        int n=nums.length;
        dp=new int[n+1][n+1];
        for(int i=0;i<=n;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        LinkedList<Integer> list = Arrays.stream(nums)
                                 .boxed()
                                 .collect(Collectors.toCollection(LinkedList::new));
        if(list.size()==0)
        {
            return 0;
        }
        list.addFirst(1);
        list.addLast(1);
        return dfs(list,1,list.size()-2);
    }
    int dfs(LinkedList<Integer> list,int l,int r)
    {
        if(l>r)
        {
            return 0;
        }
        if(dp[l][r]!=-1)
        {
            return dp[l][r];
        }
        int coins=0;
        for(int i=l;i<=r;i++)
        {
            coins=list.get(l-1)*list.get(i)*list.get(r+1);
            coins+=dfs(list,l,i-1)+dfs(list,i+1,r);
            dp[l][r]=Math.max(dp[l][r],coins);
        }
        return dp[l][r];
    }
    
}
