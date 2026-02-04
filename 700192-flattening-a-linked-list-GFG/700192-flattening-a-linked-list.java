/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    private Node merge(Node h1,Node h2){
        if(h1==null)return h1;
        if(h2==null) return h2;
        
        Node head=new Node(-1);
        Node temp=head;
        while(h1!=null  && h2!=null ){
        Node ptr;
        if(h1.data<h2.data){
            ptr=h1.bottom;
            temp.bottom=h1;
            h1.bottom=null;
            h1=ptr;
        }else{
            ptr=h2.bottom;
            temp.bottom=h2;
            h2.bottom=null;
            h2=ptr;
        }
        temp=temp.bottom;
            
        }
        if(h1!=null){
            temp.bottom=h1;
        }else{
            temp.bottom=h2;
        }
        return head.bottom;
    }
    public Node flatten(Node root) {
        // code here
        if(root==null||root.next==null)return root;
        
        Node fLL= flatten(root.next);
        return merge(root,fLL);
        
    }
}