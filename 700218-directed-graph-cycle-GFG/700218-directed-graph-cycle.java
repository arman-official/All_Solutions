class Solution {
    public boolean isCyclic(int V, int[][] edges) {
        // code here
        boolean[] vis=new boolean[V];
        boolean[] currPath=new boolean[V];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        boolean res=false;
        for(int i= 0;i<V;i++){
            
        res= fun(vis,currPath,i,adj);
        if(res)return res;
        }
        return res;
    }public boolean fun(boolean[] vis,boolean[] currPath,int node,ArrayList<ArrayList<Integer>> adj){
        // if(currPath[node])return true;
        vis[node]=true;
        currPath[node]=true;
        boolean result=false;
        for(int neighbors:adj.get(node)){
            if(currPath[neighbors])return true;
            if(!vis[neighbors]){
                result= result || fun(vis,currPath,neighbors,adj);
                if(result)return result;
            }
        }
        currPath[node]=false;
        return result;
        
    }
}