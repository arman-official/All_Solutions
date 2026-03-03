// User function Template for Java
class pair{
    int node;
    int dis;
    pair(int x,int y){
        node=x;
        dis=y;
    }
}
class Solution {

    public int[] shortestPath(int V, int E, int[][] edges) {
        // Code here
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<pair>());
        // int[] indegree=new int[V];
        // Arrays.fill(indegree,(int)(1e9));
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new pair(edges[i][1],edges[i][2]));
            // indegree[edges[i][1]]++;
        }
        int[] dist=new int[V];
        Arrays.fill(dist,(int)(1e9));
        dist[0]=0;
        Queue<pair> q=new LinkedList<>();
        q.add(new pair(0,0));
        while(!q.isEmpty()){
            pair tnode=q.remove();
            int topnode=tnode.node;
            int topdis=tnode.dis;
            for(pair nbr:adj.get(topnode)){
                if(dist[nbr.node]>topdis+nbr.dis){
                    dist[nbr.node]=topdis+nbr.dis;
                    q.add(new pair(nbr.node,dist[nbr.node]));
                }
            }
        }
        for(int i=0;i<V;i++){
            if(dist[i]>=(int)(1e9)){
                dist[i]=-1;
            }
        }
        return dist;
        
    }
}