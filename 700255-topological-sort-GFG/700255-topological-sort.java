class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        Stack<Integer> s=new Stack<>();
        boolean[] vis=new boolean[V];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        // int[] adj=new int[V];
        for(int i=0;i<V;i++)
        adj.add(new ArrayList<Integer>());
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        for(int i=0;i<V;i++){
            fun(i,s,vis,adj);
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!s.isEmpty()){
            res.add(s.pop());
        }
        return res;
    }void fun(int node,Stack<Integer> s,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        // if(node==-1)return;
        if(vis[node])return;
        vis[node]=true;
        
        for(int i:adj.get(node)){
            fun(i,s,vis,adj);
        }
        s.add(node);
        
    }
}