class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int size=s.size();
        f(s,size/2);
        
        for(int i=0;i<s.size();i++){
            System.out.print(s.pop()+" ");
        }
        
    }void f(Stack<Integer> s,int size){
        int k=s.pop();
        if(size==0)return;
        
        f(s,size-1);
        s.push(k);
        
    }
}