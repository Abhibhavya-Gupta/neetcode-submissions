class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int ans=Integer.MAX_VALUE;
        int l=0,r=0;
        int sum=0;
        while(r<nums.length)
        {
            while(r<nums.length && sum<target)
            {
                sum+=nums[r++];
            }
            while(l<r && sum>=target)
            {
                ans=Math.min(ans,r-l);
                sum-=nums[l++];
            }
        }

        return ans==Integer.MAX_VALUE?0:ans;
    }
}