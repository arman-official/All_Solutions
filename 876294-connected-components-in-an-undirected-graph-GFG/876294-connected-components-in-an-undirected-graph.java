class Solution {
    public ArrayList<ArrayList<Integer>> getComponents(int V, int[][] edges) {
        // code here
        boolean[] vis=new boolean[V];
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<>());
        for(int[] i:edges){
            adj.get(i[0]).add(i[1]);
            adj.get(i[1]).add(i[0]);
        }
        ArrayList<ArrayList<Integer>> res=new ArrayList<>();
        for(int i=0;i<V;i++){
            if(!vis[i]){
                res.add(bfs(i,vis,adj));
            }
        }
        return res;
    }public ArrayList<Integer> bfs(int node,boolean[] vis,ArrayList<ArrayList<Integer>> adj){
        Queue<Integer> q=new LinkedList<Integer>();
        ArrayList<Integer> ans=new ArrayList<>();
        q.add(node);
        vis[node]=true;
        while(!q.isEmpty()){
            int it=q.remove();
            for(int i:adj.get(it)){
                if(!vis[i]){
                    q.add(i);
                    vis[i]=true;
                }
            }
            ans.add(it);
        }return ans;
    }
}