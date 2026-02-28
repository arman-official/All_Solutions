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
        for(int i=0;i<V;i++){
            if(!vis[i]){
            res= res||fun(adj,vis,currPath,i);
            if(res)return res;
            }
        }return res;
    }
    public boolean fun(ArrayList<ArrayList<Integer>> adj,boolean[] vis,boolean[] currPath,int node){
        if(currPath[node])return true;
        if(vis[node])return false;
        currPath[node]=true;
        vis[node]=true;
        boolean b=false;
        for(int nbr:adj.get(node)){
            b= b|| fun(adj,vis,currPath,nbr);
            if(b)return b;
        }
        currPath[node]=false;
        return b;
        
        
    }
}