class Solution {
    static int matrixMultiplication(int arr[]) {
        // code here
        int n=arr.length;
        int[][] dp=new int[n+1][n+1];
        for(int[] i:dp)
        Arrays.fill(i,-1);
        // for(int i=0;i<=n;i++)dp[i][i]=1;
        
        // for(int i=0;i<=n;i++){
            
        // }
        
        
        return fun(arr,1,n-1,dp);
    }
    static int fun(int arr[],int i,int j,int[][] dp){
        if(dp[i][j]!=-1)return dp[i][j];
        if(i==j){dp[i][j]=0;return 0;}
        
        int min= Integer.MAX_VALUE;
        
        for(int k=i;k<j;k++){
            int temp= fun(arr,i,k,dp)+fun(arr,k+1,j,dp)+ arr[i-1]*arr[k]*arr[j];
            min= Math.min(min,temp);
            
        }dp[i][j]=min;
        return min;
        
    }
}