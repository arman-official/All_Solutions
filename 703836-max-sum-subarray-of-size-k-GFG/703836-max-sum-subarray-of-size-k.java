class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        // Code here
        // int currsum=0;
        // for(int i=0;i<k;i++){
        //     currsum+=arr[i];
        // }
        int max_sum=Integer.MIN_VALUE;
        int i=0,j=0;
        int curr_sum=0;
        while(j<arr.length){
            curr_sum+= arr[j];
            
            if(j-i+1<k){
                j++;
            }else{
                max_sum= Math.max(curr_sum,max_sum);
                curr_sum -= arr[i];
                i++;
                j++;
            }
            
        }
        return max_sum;
    }
}