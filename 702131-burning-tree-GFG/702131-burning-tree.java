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
    public int Time(Node start,HashMap<Node,Node> m){
        Queue<Node> q=new LinkedList<>();
        int t=0;
        q.add(start);
        ArrayList<Node> vis=new ArrayList<>();
        vis.add(start);
        while(!q.isEmpty()){
            int size=q.size();
            int flag=0;
            for(int i=0;i<size;i++){
                Node temp=q.remove();
                if(temp.left!=null && !vis.contains(temp.left)){
                    q.add(temp.left);
                    flag=1;
                    vis.add(temp.left);
                    
                }
                if(temp.right!=null && !vis.contains(temp.right)){
                    q.add(temp.right);
                    flag=1;
                    vis.add(temp.right);

                }
                if( m.containsKey(temp) && !vis.contains(m.get(temp))){
                    q.add(m.get(temp));
                    flag=1;
                    vis.add(m.get(temp));

                }
                
                
            }
            if(flag==1)t++;
        }return t;
    }
        Node res;
    public Node bfsMapParent(Node root, HashMap<Node,Node> m,int start){
        Queue<Node> q=new LinkedList<>();
        q.add(root);
        
        while(!q.isEmpty()){
            Node temp=q.remove();
            if(temp.data==start)res=temp;
            
            if(temp.left!=null){
                m.put(temp.left,temp);
                q.add(temp.left);
            }
            if(temp.right!=null){
                m.put(temp.right,temp);
                q.add(temp.right);
            }
        }
        return res;
    }
    public int minTime(Node root, int target) {
        HashMap<Node,Node> m=new HashMap<>();
        // Node res;
        Node t= bfsMapParent(root,m,target);
        return Time(t,m);
        
    }
}