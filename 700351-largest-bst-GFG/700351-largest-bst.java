// class Node
// {
//     int data;
//     Node left, right;

//     public Node(int d)
//     {
//         data = d;
//         left = right = null;
//     }
// }
class Info{
    boolean isBst;
    int size,max,min;
    Info(boolean isBst,int size,int max,int min){
        this.isBst=isBst;
        this.max=max;
        this.min=min;
        this.size=size;
    }
}
class Solution {

    // Return the size of the largest sub-tree which is also a BST
    static Info largest(Node root) {
        // Write your code here
        if(root==null)return new Info(true,0,Integer.MIN_VALUE,Integer.MAX_VALUE);
        
        Info left= largest(root.left);
        Info right= largest(root.right);
        
        boolean b= left.isBst&&right.isBst&&root.data>left.max&&root.data<right.min;
        
        if(b)
        return new Info(
            b,left.size+right.size+1,Math.max(right.max,root.data),Math.min(root.data,left.min)
            );
        else{
            return new Info(false,Math.max(left.size,right.size),0,0);
        }
        
    }
    static int largestBst(Node root){
        Info ans= largest(root);
        return ans.size;
    }
}