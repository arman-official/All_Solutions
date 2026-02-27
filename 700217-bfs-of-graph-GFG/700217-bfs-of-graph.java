class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> res=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        q.add(0);
        boolean[] vis=new boolean[adj.size()];
        vis[0]=true;
        while(!q.isEmpty()){
            int node=q.remove();
            for(int i:adj.get(node)){
                if(!vis[i]){
                q.add(i);
                vis[i]=true;
                    
                }
            }
            res.add(node);
        }
        return res;
    }
}