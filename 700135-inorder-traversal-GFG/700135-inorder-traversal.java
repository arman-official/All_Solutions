/*
class Node {
    int data;
    Node left, right;
    Node(int item){
        data = item;
        left = right = null;
    }
}
*/
class Solution {
    ArrayList<Integer> l=new ArrayList<>();
    public void fun(Node root){
        if(root==null)return;
        fun(root.left);
        l.add(root.data);
        fun(root.right);
    }
    public ArrayList<Integer> inOrder(Node root) {
        // code here
        fun(root);
        return l;
    }
}