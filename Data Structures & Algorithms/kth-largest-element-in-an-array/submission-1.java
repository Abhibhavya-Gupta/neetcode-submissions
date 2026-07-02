class Solution {
    public int findKthLargest(int[] nums, int k) {
        PriorityQueue<Integer> que=new PriorityQueue<>((a,b)-> b-a);
        for(int e:nums)
        {
            que.offer(e);
        }
        int ans=0;
        for(int i=0;i<k;i++)
        {
            ans=que.poll();
        }
        return ans;
    }
}
