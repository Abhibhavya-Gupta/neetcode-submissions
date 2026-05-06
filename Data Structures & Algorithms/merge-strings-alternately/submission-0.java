class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i=0;
        String s="";
        while(i<word1.length() && i<word2.length())
        {
            s+=word1.charAt(i);
            s+=word2.charAt(i);
            i++;
        }
        while(i<word1.length())
        {
            s+=word1.charAt(i);
            i++;
        }
          while(i<word2.length())
        {
            s+=word2.charAt(i);
            i++;
        }
        return s;
    }
}