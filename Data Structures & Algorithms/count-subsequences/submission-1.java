class Solution {
    int[][] dp;
    public int numDistinct(String s, String t) {
        int l1=s.length(),l2=t.length();
        dp=new int[l1+1][l2+1];
        for(int i=0;i<=l1;i++)
        {
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<=l1;i++)
        {
            dp[i][l2]=1;
        }
        for(int j=0;j<l2;j++)
        {
            dp[l1][j]=0;
        }
        if(s.length()<t.length())
        {
            return 0;
        }
        return helper(s,t,0,0);
    }
    int helper(String s1,String s2,int i,int j)
    {
        if(i==s1.length() && j<s2.length() || j==s2.length())
        {
            return dp[i][j];
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }

        int take=0;
        if(s1.charAt(i)==s2.charAt(j))
        {
           take = helper(s1,s2,i+1,j+1);
        }
        int skip = helper(s1,s2,i+1,j);
        dp[i][j] = take+skip;
        return dp[i][j];
        


    }
}
