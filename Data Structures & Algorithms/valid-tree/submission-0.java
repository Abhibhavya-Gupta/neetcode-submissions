class Solution {
    public boolean validTree(int n, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        HashSet<Integer> visited=new HashSet<>();

        if(n==0) return true;

        for(int i=0;i<n;i++)
        {
            adj.add(new ArrayList<>());
        }
        for(int[] plist:edges)
        {
            int u=plist[0];
            int v=plist[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        if(!DFS(adj,visited,0,-1)) return false;

        return visited.size()==n;
    }
    public boolean DFS(ArrayList<ArrayList<Integer>> adj,HashSet<Integer> visited,int node,int parent)
    {
        visited.add(node);

        for(int nei:adj.get(node))
        {
            if(nei==parent) continue;

              if(visited.contains(nei)) return false;

            if(!DFS(adj,visited,nei,node))
            {
                return false;
            }

        }
        return true;
    }
}
