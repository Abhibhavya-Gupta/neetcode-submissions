class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> q = new PriorityQueue<>((a,b)->b-a);
        for(int n:stones)
        {
            q.offer(n);
        }
        while(q.size()>1)
        {
            int heaviest=q.poll();
            int sec=q.poll();
            int rem=heaviest - sec;
            if(rem>0)
            {
                q.offer(rem);
            }
            
        }
        return !q.isEmpty()?q.poll():0;
    }
}
