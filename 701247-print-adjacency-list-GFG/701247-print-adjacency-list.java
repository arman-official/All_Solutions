// User function Template for Java
class Solution {
    public List<List<Integer>> printGraph(int V, int edges[][]) {
        List<List<Integer>> ll=new ArrayList<>();
        for(int i=0;i<V;i++)ll.add(new ArrayList<Integer>());
        for(int i=0;i<edges.length;i++){
            // ArrayList<Integer> l=new ArrayList<>();
            // for(int j=edges[i].length;j++){
                ll.get(edges[i][0]).add(edges[i][1]);
                ll.get(edges[i][1]).add(edges[i][0]);
            // }
        }
            return ll;
    }
}