class Solution {
    public int maxProduct(int[] nums) {
        int ans=Integer.MIN_VALUE;
        for(int n:nums)
        ans=Math.max(ans,n);

        int maxp=1,minp=1;
        for(int num:nums){
            if(num==0)
            {
                maxp=1;
                minp=1;
                continue;
            }
            int temp=maxp*num;
            maxp=Math.max(maxp*num,minp*num);
            maxp=Math.max(maxp,num);

            minp=Math.min(minp*num,temp);
            minp=Math.min(minp,num);
            ans=Math.max(ans,maxp);
        }
        return ans;
    }
}
