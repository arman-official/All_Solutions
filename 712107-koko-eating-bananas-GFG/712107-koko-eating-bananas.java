class Solution {
    public int kokoEat(int[] arr, int k) {
        // code here
        int max=Integer.MIN_VALUE;
        for(int i:arr)max=Math.max(max,i);
        
        int i=1,j=max;
        int ans=0;
        while(i<=j){
            int mid=i+(j-i)/2;
            if(fun(arr,mid)<=k){
                j=mid-1;
                ans=mid;
            }else{
                i=mid+1;
            }
        }
        return ans;
        
        
    }
    public int fun(int[] arr,int perHrCapacity){
        int sum=0;
        for(int i:arr){
            sum+= Math.ceil((double)i/perHrCapacity);
            
        }return sum;
    }
}
