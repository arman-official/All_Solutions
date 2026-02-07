// User function Template for Java

class Solution {
    public static void flat(Node root,ArrayList<Node> l){
        if(root==null)return;
        l.add(root);
        
        flat(root.left,l);
        flat(root.right,l);
        
    }
    public static void flatten(Node root) {
        // code here
        
        ArrayList<Node> l=new ArrayList<>();
        flat(root,l);
        // Node res=root;
        for(int i=0;i<l.size()-1;i++){
            l.get(i).left=null;
            l.get(i).right=l.get(i+1);
        }
    }
}