class Solution {
    public boolean validPalindrome(String s) {
        int l=0;
        int r=s.length()-1;
        // boolean ispal=true;
        // for(int i=0;i<s.length();i++)
        // {
        //     l=0;
        //     r=s.length()-1;
        //     ispal=true;
        //    while(l<r)
        //    {
        //     if(l==i)
        //     {
        //         l++;
        //         continue;
        //     }
        //     if(r==i)
        //     {
        //         r--;
        //         continue;
        //     }
        //     if(s.charAt(l)!=s.charAt(r))
        //     {
        //         ispal=false;
        //         break;
        //     }
        //     r--;
        //     l++;

        //    }
        //    if(ispal) return true;
        // }
        // return false;
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                boolean left=isPal(s,l+1,r);
                if(left) return true;
                return isPal(s,l,r-1);
            }
            l++;
            r--;
        }
        return true;
    }
    private boolean isPal(String s,int l,int r)
    {
        while(l<r)
        {
            if(s.charAt(l)!=s.charAt(r))
            {
                return false;
            }
            l++;
            r--;
        }
        return true;
    }
}