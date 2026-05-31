class Solution {
    public String addBinary(String a, String b) {
        int m=a.length(),n=b.length();
        int i=m-1,j=n-1;
        String s="";
        int carry=0;
        
        while(i>=0 || j>=0)
        {
            int x=0,y=0;
            if(i>=0) x=(a.charAt(i)-'0');
            if(j>=0) y=(b.charAt(j)-'0');
            String s1=Integer.toString((x+y+carry)%2);
            s=s1+s;
            carry=(x+y+carry)/2;

            i--;
            j--;

        }
       
        if(carry>0)
        {
            s="1"+s;
        }
        return s;
           
    }
}