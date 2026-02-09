/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
       HashSet<Integer> s=new HashSet<>();
    public boolean find(TreeNode root,int k){
        if(root==null)return false;
        if(s.contains(k-root.val))return true;
        s.add(root.val);
        return find(root.left,k)||find(root.right,k);
    }
    public boolean findTarget(TreeNode root, int k) {
        if(root==null)return false;
       return find(root,k); 
    }
}