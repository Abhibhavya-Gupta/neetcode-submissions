class Solution {
    public int scoreOfString(String s) {
        int sc=0;
        for(int i=0;i<s.length()-1;i++)
        {
            int x=s.charAt(i);
            int y=s.charAt(i+1);
            sc+=Math.abs(x-y);
        }
        return sc;
    }
}