class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        // code here
        int[] degree=new int[V];
        Queue<Integer> q=new LinkedList<Integer>();
        ArrayList<Integer> res=new ArrayList<>();
        
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i=0;i<V;i++)adj.add(new ArrayList<Integer>());
        for(int i=0;i<edges.length;i++){
            degree[edges[i][1]]++;
            adj.get(edges[i][0]).add(edges[i][1]);
        }
        
        for(int i=0;i<degree.length;i++){
            if(degree[i]==0)
            q.add(i);
        }
        
        while(!q.isEmpty()){
            int temp=q.remove();
            
            for(int i=0;i<adj.get(temp).size();i++){
                degree[adj.get(temp).get(i)]--;
                if(degree[adj.get(temp).get(i)]<=0)q.add(adj.get(temp).get(i));
            }
            res.add(temp);
        }
        
        return res;
    }
}