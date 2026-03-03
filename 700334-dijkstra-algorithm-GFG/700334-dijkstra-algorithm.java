class pair{
    int node;
    int dis;
    pair(int x,int y){
        node=x;
        dis=y;
    }
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        int[] dist=new int[V];
        Arrays.fill(dist,(int)(1e9));
        dist[src]=0;
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<pair>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
            adj.get(edges[i][1]).add(new pair(edges[i][0],edges[i][2]));
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)->a.dis-b.dis);
        pq.add(new pair(src,0));
        while(!pq.isEmpty()){
            pair top=pq.remove();
            int nnode=top.node;
            int ndis=top.dis;
            for(int i=0;i<adj.get(nnode).size();i++){
                pair nbr=adj.get(nnode).get(i);
                if(dist[nbr.node]> ndis+nbr.dis){
                    dist[nbr.node]= ndis+nbr.dis;
                    pq.add(new pair(nbr.node,dist[nbr.node]));
                }
            }
        }
        return dist;
    }
}