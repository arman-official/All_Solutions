// User function Template for Java

class Solution {
    public int[] bellmanFord(int V, int[][] edges, int src) {
        // code here
        int[] dis=new int[V];
        Arrays.fill(dis,(int)(1e8));
        dis[src]=0;
        for(int j=0;j<V-1;j++)
        for(int i=0;i<edges.length;i++){
            if(dis[edges[i][0]]!=(int)(1e8) && dis[edges[i][1]]>dis[edges[i][0]]+edges[i][2]){
                dis[edges[i][1]]=dis[edges[i][0]]+edges[i][2];
            } 
        }
        for(int i=0;i<edges.length;i++){
            if(dis[edges[i][0]]!=(int)(1e8) && dis[edges[i][1]]>dis[edges[i][0]]+edges[i][2]){
                return new int[]{-1};
                
            } 
        }
        return dis;
    }
}
