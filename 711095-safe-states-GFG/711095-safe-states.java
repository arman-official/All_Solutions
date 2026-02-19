class Solution {
    public ArrayList<Integer> safeNodes(int V, int[][] edges) {
        // Code here
        boolean[] vis=new boolean[V];
        boolean[] currPath=new boolean[V];
        ArrayList<Integer> res=new ArrayList<>();
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        Boolean[] dp=new Boolean[V];
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        for(int i=0;i<V;i++){
            if(!fun(adj,vis,currPath,i,dp))
            res.add(i);
        }return res;
    }
    
    public boolean fun(ArrayList<ArrayList<Integer>> adj,boolean[] vis,boolean[] currPath,int node,Boolean[] dp){
        if(dp[node]!=null)return dp[node];
        vis[node]=true;
        currPath[node]=true;
        boolean res= false;
        for(int nbr:adj.get(node)){
            if(currPath[nbr])return true;
            res= res|| fun(adj,vis,currPath,nbr,dp);
            if(res)return true;
        }
        currPath[node]=false;
        return dp[node]=res;
        
    }
}