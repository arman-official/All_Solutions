
class pair{
    int edge;
    int dis;
    pair(int edge,int dis){
        this.edge=edge;
        this.dis=dis;
    }
}
class Solution {
    int INF=(int)(1e9);
    public List<Integer> shortestPath(int n, int m, int edges[][]) {
        //  Code Here.
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++)adj.add(new ArrayList<pair>());
        for(int i=0;i<m;i++){
            adj.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
            adj.get(edges[i][1]).add(new pair(edges[i][0],edges[i][2]));
        }
        int src=1;
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->Integer.compare(a.dis,b.dis));
        pq.add(new pair(src,0));
        int[] dist=new int[n+1];
        int[] parent=new int[n+1];
        Arrays.fill(dist,INF);
        dist[src]=0;
        for(int i=0;i<n+1;i++)parent[i]=i;
        while(!pq.isEmpty()){
            pair top=pq.poll();
            int topedge=top.edge;
            int topdis=top.dis;
                if(topdis>dist[topedge])continue;
            for(pair nbr:adj.get(topedge)){
                if(dist[nbr.edge]>topdis+nbr.dis){
                    
                    dist[nbr.edge]=topdis+nbr.dis;
                    pq.add(new pair(nbr.edge,dist[nbr.edge]));
                    parent[nbr.edge]=topedge;
                }
            }
        }
        List<Integer> path=new ArrayList<>();
        if(dist[n]==INF){
            path.add(-1);
            return path;
        }
        int nodee=n;
        while(parent[n]!=n){
            path.add(n);
            n=parent[n];
        }
        path.add(src);
        path.add(dist[nodee]);
        Collections.reverse(path);
        return path;
    }
}