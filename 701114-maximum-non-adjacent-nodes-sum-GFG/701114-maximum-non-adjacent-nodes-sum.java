/*
class Node {
    int data;
    Node left, right;

    Node(int data)
    {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}
*/
class Pair{
    int first;//if take curr.val
    int second;//if not take (if prev not take,this can also not)

    Pair(int f,int s){
        this.first=f;
        this.second=s;
    }
}
class Solution {
    public Pair maxSum(Node root){
        if(root==null)return new Pair(0,0);
        
        Pair left= maxSum(root.left);
        Pair right= maxSum(root.right);
        
        // Pair res;
        int first= root.data+left.second+right.second;
        int second= Math.max(left.first,left.second)+Math.max(right.first,right.second);
        
        return new Pair(first,second);
    }
    
    public int getMaxSum(Node root) {
        // code here
        Pair res= maxSum(root);
        return Math.max(res.first,res.second);
    }
}