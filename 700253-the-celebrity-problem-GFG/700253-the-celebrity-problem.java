class Solution {
    public int celebrity(int a[][]) {
        // code here
        Stack<Integer> s=new Stack<>();
        for(int i=0;i<a.length;i++)
        s.push(i);
        
        while(s.size()>1){
            int p1=s.pop();
            int p2=s.pop();
            if(a[p1][p2]==1){
                s.push(p2);
            }
            else if(a[p2][p1]==1){
                s.push(p1);
            }else{
                continue;
            }
        }
        if(s.isEmpty())return -1;
        int j=s.pop();
        for(int i=0;i<a.length;i++){
            if(a[i][j]==0)return -1;
            
        }
        for(int i=0;i<a.length;i++){
            if(i!=j && a[j][i]==1)return -1;
            
        }
    
        return j;
    }
}