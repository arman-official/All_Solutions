class Solution {
    public boolean isBalanced(String a) {
        // code here
        Stack<Character> s=new Stack<>();
        for(int i=0;i<a.length();i++){
            if(a.charAt(i)=='[' ||a.charAt(i)=='{' ||a.charAt(i)=='('){
                s.push(a.charAt(i));}
            else{
                if(s.isEmpty())return false;
                if(a.charAt(i)==')' && s.peek()=='(')s.pop();
                else if(a.charAt(i)=='}' && s.peek()=='{')s.pop();
                else if(a.charAt(i)==']' && s.peek()=='[')s.pop();
                else return false;
            }
            
            
        }
            return s.size()==0;
    }
}
