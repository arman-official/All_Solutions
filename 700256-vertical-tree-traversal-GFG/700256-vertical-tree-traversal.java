/*
class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
*/
class Pair{
    Node node;
    int ver;
    Pair(Node node,int ver){
        this.ver=ver;
        this.node=node;
    }
}

class Solution {
    public ArrayList<ArrayList<Integer>> verticalOrder(Node root) {
        // code here
        ArrayList<ArrayList<Integer>> res=new ArrayList<ArrayList<Integer>>();      
        if(root==null)return res;
        Queue<Pair> q=new LinkedList<>();
        q.add(new Pair(root,0));
        TreeMap<Integer, ArrayList<Integer>> m=new TreeMap<>();
        
        while(!q.isEmpty()){
            Pair temp=q.remove();
            Node node=temp.node;
            int v=temp.ver;
            
            if(!m.containsKey(v))m.put(v,new ArrayList<Integer>());
            
            ArrayList<Integer> l=m.get(v);
            l.add(node.data);
            m.put(v,l);
            
            if(node.left!=null){
                q.add(new Pair(node.left,v-1));
            }
            if(node.right!=null){
                q.add(new Pair(node.right,v+1));
            }
            
        }
        
        for(ArrayList<Integer> l:m.values()){
            res.add(l);
        }
        return res;
    }
}