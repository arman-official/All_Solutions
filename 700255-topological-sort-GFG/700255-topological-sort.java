class Solution {
    public ArrayList<Integer> topoSort(int V, int[][] edges) {
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        int[] indegree=new int[V];
        for(int i=0;i<V;i++)adj.add(new ArrayList<Integer>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            indegree[v]++;
            adj.get(u).add(v);
        }
        Queue<Integer> q=new LinkedList<>();
        for(int i=0;i<V;i++){
            if(indegree[i]==0)q.add(i);
        }
        ArrayList<Integer> ans=new ArrayList<>();
        while(!q.isEmpty()){
            int node=q.poll();
            for(int i=0;i<adj.get(node).size();i++){
                int nbr=adj.get(node).get(i);
                indegree[nbr]--;
                if(indegree[nbr]==0)q.add(nbr);
            }
            ans.add(node);
        }
        return ans;
    }
}