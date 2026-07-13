class Solution {
    class Pair{
        int dist;
        int[] coord=new int[2];
        Pair(int dist,int[] coord)
        {
            this.dist=dist;
            this.coord=coord;
        }
    }
    public int[][] kClosest(int[][] points, int k) {
        //min heap based on the distance from origin
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->a.dist-b.dist);
        int[][] ans = new int[k][2];
        for(int[] point:points)
        {
            int x=point[0];
            int y=point[1];
            int dist = x*x + y*y;
            pq.offer(new Pair(dist,point));
        }
        int i=0;
        while(i<k)
        {
            ans[i]=(pq.poll()).coord;
            i++;
        }
        return ans;
    }
}
