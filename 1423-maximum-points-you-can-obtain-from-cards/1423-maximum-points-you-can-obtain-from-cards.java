class Solution {
    public int maxScore(int[] a, int k) {
        int Lsum=0,Rsum=0;

        for(int i=0;i<k;i++)Lsum+=a[i];
        int maxS=Lsum;
        
        
        for(int i=k-1;i>=0;i--){
            int Rind= a.length+i-k;
            Lsum-= a[i];
            Rsum+= a[Rind];
            
            maxS= Math.max(maxS,Lsum+Rsum);
        }
        return maxS;
    }
}