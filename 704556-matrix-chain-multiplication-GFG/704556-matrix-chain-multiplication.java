class Solution {
    static int matrixMultiplication(int arr[]) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n][n];
        for(int[] i:dp)Arrays.fill(i,0);
        for(int i=n-1;i>0;i--){
            for(int j=i+1;j<n;j++){
                int min=Integer.MAX_VALUE;
                for(int k=i;k<j;k++){
                    int steps= (arr[i-1]*arr[k]*arr[j])+dp[i][k]+dp[k+1][j];
                    min=Math.min(min,steps);
                }
                dp[i][j]=min;
            }
        }
        
        
        return dp[1][n-1];
    }
    // static int fun(int[] arr,int i,int j){
    //     if(i==j)return 0;
        
    //     for(int k=i;k<j;k++){
    //         int steps= (arr[i-1]*arr[k]*arr[j])+fun(arr,i,k)+fun(arr,k+1,j);
    //         min=Math.min(min,steps);
    //     }return min;
        
    // }
}