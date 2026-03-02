class pair{
    int node;
    int dis;
    pair(int x,int y){
        this.node=x;
        this.dis=y;
    }
}
class Solution {
    public int[] dijkstra(int V, int[][] edges, int src) {
        // code here
        int[] distance=new int[V];
        Arrays.fill(distance,(int)(1e9));
        distance[src]=0;
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<pair>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
            adj.get(edges[i][1]).add(new pair(edges[i][0],edges[i][2]));
        }
        PriorityQueue<pair> pq=new PriorityQueue<>((a,b)-> a.dis-b.dis);
        
        pq.add(new pair(src,0));
        while(!pq.isEmpty()){
            pair top=pq.remove();
            int currNode=top.node;
            int edgeWt=top.dis;
            if(edgeWt>distance[currNode])continue;
            for(int i=0;i<adj.get(currNode).size();i++){
                pair nbr= adj.get(currNode).get(i);
                if(edgeWt + nbr.dis<distance[nbr.node]){
                    distance[nbr.node]=edgeWt+ nbr.dis;
                    pq.add(new pair(nbr.node,distance[nbr.node]));
                }
            }
            
        }return distance;
        
    }
}