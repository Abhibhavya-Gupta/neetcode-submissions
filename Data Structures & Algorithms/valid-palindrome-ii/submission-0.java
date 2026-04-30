class Solution {
    public boolean validPalindrome(String s) {
        int l;
        int r;
        boolean ispal=true;
        for(int i=0;i<s.length();i++)
        {
            l=0;
            r=s.length()-1;
            ispal=true;
           while(l<r)
           {
            if(l==i)
            {
                l++;
                continue;
            }
            if(r==i)
            {
                r--;
                continue;
            }
            if(s.charAt(l)!=s.charAt(r))
            {
                ispal=false;
                break;
            }
            r--;
            l++;

           }
           if(ispal) return true;
        }
        return false;
    }
}