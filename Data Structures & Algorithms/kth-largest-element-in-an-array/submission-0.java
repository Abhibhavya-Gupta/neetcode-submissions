class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> mh = new PriorityQueue<>(); // min heap
        for(int i=0;i<nums.length;i++)
        {
        mh.offer(nums[i]);
        if(mh.size()>k)
        {
        mh.poll();
        }
        }
        return mh.poll();
    }
}
