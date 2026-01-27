// User function Template for Java
class Solution {
    public int findTarget(int a[], int t) {
        // code here
        int l=0;
        int r=a.length-1;
        
        while(l<=r){
            int m= l+(r-l)/2;
            if(m>0 && a[m-1]==t)return m-1;
            if(m<a.length-1 && a[m+1]==t)return m+1;
            if(a[m]==t)return m;
            else if(a[m]>t)r=m-1;
            else l=m+1;
            
            
        }return -1;
    }
}