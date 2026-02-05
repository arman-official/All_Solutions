/*
Structure of Node class is:

class Node {
    int data;
    Node left, right;

    public Node(int data){
        this.data = data;
    }
}
*/

class Solution {
    int res=-1;
    int kGlobal;
    public boolean fun(Node root,int node){
        if(root==null)return false;
        if(root.data==node)return true;
        
        boolean left= fun(root.left,node);
        boolean right= fun(root.right,node);
        
        if(left || right ){
            kGlobal--;
            if(kGlobal==0){
                res=root.data;
                
            }
        }
        
        return left||right;
        
    }
    public int kthAncestor(Node root, int k, int node) {
        // Write your code here
        kGlobal=k;
        boolean ans= fun(root,node);
        return res;
        
        
        
    }
}