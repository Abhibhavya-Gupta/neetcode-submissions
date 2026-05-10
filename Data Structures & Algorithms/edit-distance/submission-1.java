class Solution {
    int[][] dp;
    public int minDistance(String word1, String word2) {
        dp=new int[word1.length()+1][word2.length()+1];
        for(int i=0;i<=word1.length();i++)
        {
            Arrays.fill(dp[i],-1);
        }
        for(int i=0;i<word1.length();i++)
        {
            dp[i][word2.length()]=word1.length()-i;
        }

        for(int j=0;j<word2.length();j++)
        {
            dp[word1.length()][j]=word2.length()-j;
        }

        dp[word1.length()][word2.length()]=0;
        return helper(word1,word2,0,0);
    }
    int helper(String w1,String w2,int i,int j)
    {
        if(i==w1.length() && j==w2.length() || i==w1.length() && j<w2.length() || j==w2.length() && i<w1.length())
        {
            return dp[i][j];
        }

        if(dp[i][j]!=-1)
        {
            return dp[i][j];
        }
   
        if(w1.charAt(i)==w2.charAt(j))
        {
            return helper(w1,w2,i+1,j+1);
        }
        else{
            //insert
            int ins = helper(w1,w2,i,j+1);

            //delete
            int del = helper(w1,w2,i+1,j);

            //replace
            int rep = helper(w1,w2,i+1,j+1);

            dp[i][j] = Math.min(Math.min(ins,del),rep)+1;
            return dp[i][j];

        }
    }
}
