class Solution {
    public int[] countBits(int n) {
        int[] arr=new int[n+1];
        arr[0]=0;
        for(int i=0;i<=n;i++)
        {
            int num=i;
            while(num>0)
            {
                arr[i]+=num%2;
                num/=2;
            }
        }
        return arr;
    }
}
