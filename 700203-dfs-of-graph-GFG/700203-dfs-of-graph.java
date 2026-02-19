class Solution {
    public ArrayList<Integer> dfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        ArrayList<Integer> l=new ArrayList<>();
        // Stack<Integer> s=new Stack<>();
        boolean[] vis=new boolean[adj.size()];
        // s.add(0);
        // vis[0]=true;
        // l.add(dj.get(0).get(0));
         dfs(adj,l,vis,0);
        // while(!s.isEmpty()){
        //     int temp= s.pop();
        //   l.add(temp);
        //     // vis[temp]=true;
        //     for(int i=adj.get(temp).size()-1;i>=0;i--){
        //         if(!vis[adj.get(temp).get(i)]){
        //             s.add(adj.get(temp).get(i));
        //             vis[adj.get(temp).get(i)]=true;
        //         }
        //     }
            
            
        // }
        return l;
        
    }
    public void  dfs(ArrayList<ArrayList<Integer>> adj,ArrayList<Integer> l,boolean[] vis,int node){
        int temp= node;
                    vis[temp]=true;
                    l.add(temp);
        for(int neighbour : adj.get(temp)) {

            if(!vis[neighbour]) {
                dfs(adj, l, vis, neighbour);
            }
        }
    }
}