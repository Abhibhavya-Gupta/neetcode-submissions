class Solution {
    public int countComponents(int n, int[][] edges) {
        DSU dsu=new DSU(n);
        for(int[] edge:edges)
        {
            int node1=edge[0];
            int node2=edge[1];
            dsu.UnionBySize(node1,node2);
        }
        return components;
    }
}

int components=0;

public class DSU {
    int[] rank;
    int size[];
    int[] parent;
    
    DSU(int nodes)
    {
        components=nodes;
        rank=new int[nodes];
        parent=new int[nodes];
        size=new int[nodes];
        for(int i=0;i<nodes;i++)
        {
            parent[i]=i;
            size[i]=1;
        }
        //by def rank[i]=0
    }

    public int findRootParent(int u)
    {
        if(parent[u]==u)
        {
            return u;
        }
        parent[u]=findRootParent(parent[u]);
        return parent[u];
    }

    public void UnionBySize(int node1,int node2)
    {
        int rootparent1=findRootParent(node1);
        int rootparent2=findRootParent(node2);
        if(rootparent1==rootparent2)
        {
            return;
        }
        components--;
        if (size[rootparent1]>size[rootparent2]) {
            parent[rootparent2] = rootparent1;
            size[rootparent1] += size[rootparent2];
        }
        else{
            parent[rootparent1]=rootparent2;
            size[rootparent2]+=size[rootparent1];
        }

    }
}
