class Solution {
    boolean[][] dp;
    public int countSubstrings(String s) {
        int ans=0;
        int n=s.length();
        dp=new boolean[n][n];
        for(int i=n-1;i>=0;i--)
        {
            for(int j=i;j<s.length();j++)
            {
                if(s.charAt(i)==s.charAt(j))
                {
                    if(j-i<=2 || dp[i+1][j-1]==true)
                    {
                        dp[i][j]=true;
                        ans++;
                    }
                }
            }
        }
        return ans;
    }
    
}
