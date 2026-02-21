// User function Template for Java

class Solution {
    public int countSquares(int N, int M, int mat[][]) {
        // Code here
        
        int[][] dp=new int[N][M];
        int sum=0;
        for(int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if(mat[i][j]==1){
                    if(i==0||j==0){
                        dp[i][j]=1;
                    }else{
                        dp[i][j]=1+Math.min(dp[i-1][j-1],Math.min(dp[i-1][j],dp[i][j-1]));
                    }
                    
                }
                sum+=dp[i][j];
            }
        }
        // int sum=0;
        // for(int[] i:dp)for(int j:i)sum+=j;
        return sum;
    }
}