class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)
        adj.add(new ArrayList<>());
        Stack<Integer> s=new Stack<>();
        boolean[] vis=new boolean[V];
        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        for(int i=0;i<V;i++){
            fun(s,adj,vis,i);
        }
        ArrayList<Integer> res=new ArrayList<>();
        while(!s.isEmpty()){
            res.add(s.pop());
        }
        return res;
    }void fun(Stack<Integer> s,ArrayList<ArrayList<Integer>> adj, boolean[] vis,int node){
        if(vis[node])return;
        vis[node]=true;
        for(int i=0;i<adj.get(node).size();i++){
            fun(s,adj,vis,adj.get(node).get(i));
        }
        s.add(node);
    }
}