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

class Solution {
    int count=0;
    private void pathSum(Node root,int k,int currSum,HashMap<Integer,Integer> m){
        if(root==null)return ;
        currSum+= root.data;
        int temp= currSum-k;
        if(m.containsKey(temp))count+= m.get(temp);
        m.put(currSum,m.getOrDefault(currSum,0)+1);
        
        pathSum(root.left,k,currSum,m);
        pathSum(root.right,k,currSum,m);
        
        m.put(currSum,m.get(currSum)-1);
        currSum-= root.data;
        
        
    }
    public int countAllPaths(Node root, int k) {
        // code here
        HashMap<Integer,Integer> m=new HashMap<>();
        int currSum=0;
        m.put(0,1);
        pathSum(root,k,currSum,m);
        return count;
    }
}