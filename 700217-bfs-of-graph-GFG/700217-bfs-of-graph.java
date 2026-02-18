class Solution {
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        
        ArrayList<Integer> l=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        boolean[] vis=new boolean[adj.size()];
        fun(adj,l,q,vis);
        return l;
    }ArrayList<Integer> fun(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> l,Queue<Integer> q    
    ,boolean[] vis){
        
        vis[0]=true;
        q.add(0);
        while(!q.isEmpty()){
            Integer node=q.poll();
            l.add(node);
            
            for(Integer it: adj.get(node)){
                if(!vis[it]){
                    vis[it]=true;
                    q.add(it);
                }
            }
        }
        return l;
    }
}