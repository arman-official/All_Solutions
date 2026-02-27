class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans=new ArrayList<>();
        // Stack<Integer> s=new Stack<>();
        boolean[] vis=new boolean[adj.size()];
        vis[0]=true;
        dfs(adj,vis,ans,0);
        return ans;
    }
    public void dfs(ArrayList<ArrayList<Integer>> adj,boolean[] vis,ArrayList<Integer> ans,int node){
        ans.add(node);
        for(int i=0;i<adj.get(node).size();i++){
            if(!vis[adj.get(node).get(i)]){
                vis[adj.get(node).get(i)]=true;
                dfs(adj,vis,ans,adj.get(node).get(i));
            }
        }
        
    }
}