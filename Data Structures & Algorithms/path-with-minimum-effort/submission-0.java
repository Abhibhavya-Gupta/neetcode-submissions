class Solution {
    public int minimumEffortPath(int[][] heights) {
        int rows=heights.length;
        int cols=heights[0].length;
        int[][] dist=new int[rows][cols];
        for(int i=0;i<rows;i++)
        {
            for(int j=0;j<cols;j++)
            {
                dist[i][j]=Integer.MAX_VALUE;
            }
        }
        int[][] dirns={{1,0},{0,1},{-1,0},{0,-1}};
       PriorityQueue<Pair> pq=new PriorityQueue<>((a,b)->a.curreffort-b.curreffort);
        dist[0][0]=0;
        pq.offer(new Pair(0,0,dist[0][0]));
        while(!pq.isEmpty())
        {
            Pair curr=pq.poll();
            int r=curr.r;
            int c=curr.c;
            int curreffort=curr.curreffort;
            for(int[] dirn:dirns)
            {
                int x=dirn[0];
                int y=dirn[1];
                int r1=r+x;
                int c1=c+y;
                if(r1<rows && c1<cols && r1>=0 && c1>=0)
                {
                    int diff=Math.abs(heights[r1][c1]-heights[r][c]);
                    int eff1=Math.max(curreffort,diff);
                    if(eff1<dist[r1][c1])
                    {
                        dist[r1][c1]=eff1;
                        pq.offer(new Pair(r1,c1,dist[r1][c1]));
                    }
                }
            }

        }
        return dist[rows-1][cols-1];

    }
}

class Pair{
    int r,c;
    int curreffort;
    public Pair(int r,int c,int curreffort)
    {
        this.r=r;
        this.c=c;
        this.curreffort=curreffort;
    }
}