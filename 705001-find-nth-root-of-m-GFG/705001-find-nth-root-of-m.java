class Solution {
    public int nthRoot(int n, int m) {
        // code here
        if(m==0)return m;
        if(n==1)return m;
        
        int l=1,h=m;
        while(l<=h){
            int mid=l+(h-l)/2;
            int temp=mid;
            for(int i=1;i<n;i++){
                temp *= mid;
            }
            if(temp==m)return mid;
            else if(temp<m){
                l=mid+1;
                
            }else{
                h=mid-1;
            }
            
        }
            return -1;
    }
}