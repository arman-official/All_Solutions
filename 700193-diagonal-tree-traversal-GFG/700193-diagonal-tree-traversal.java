/* Node is defined as
class Node{
    int data;
    Node left;
    Node right;
    Node(int data){
        this.data = data;
        left=null;
        right=null;
    }
}*/
class Tree {
    public ArrayList<Integer> diagonal(Node root) {
        // add your code here.
        ArrayList<Integer> res=new ArrayList<>();
        if(root==null)return res;
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node temp=q.poll();
            
            while(temp!=null){
                res.add(temp.data);
                
                if(temp.left!=null)q.add(temp.left);
                
                temp=temp.right;
            }
           
        }
        
        
        
        return res;
    }
}