class Solution {
    public ArrayList<Integer> nextLargerElement(int[] a) {
        // code here
        ArrayList<Integer> ans=new ArrayList<>();
        Stack<Integer> s=new Stack<>();
        
        for(int i=a.length-1;i>=0;i--){
            while(!s.isEmpty() && s.peek()<=a[i]){
            s.pop();}
            
            if(s.isEmpty()){
                ans.add(-1);
            }else{
                ans.add(s.peek());
            }
            s.push(a[i]);
        }
        Collections.reverse(ans);return ans;
    }
}