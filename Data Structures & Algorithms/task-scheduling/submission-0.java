class Solution {
    public int leastInterval(char[] tasks, int n) {
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);
        HashMap<Character,Integer> map = new HashMap<>();
        Queue<int[]> q = new ArrayDeque<>();
        int t=0;
        for(char c : tasks)
        {
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet())
        {
            pq.offer(entry.getValue());
        }
        while(!pq.isEmpty() || !q.isEmpty())
        {
            t++;
        
            if(!pq.isEmpty())
            {
                int curr=pq.poll()-1;
                if(curr>0)
                {
                    q.offer(new int[]{curr,t+n});
                }
            }
            //q have elements
            if(!q.isEmpty() && q.peek()[1]==t)
            {
                pq.offer(q.poll()[0]);
            }

        }
        return t;
    }
}
