class Solution {
    int minCost(int[] height) {
        // code here
        int n=height.length;
        if(n==1)return 0;
        if(n==2)return Math.abs(height[1]-height[0]);
        int[] dp=new int[n+1];
        Arrays.fill(dp,-1);
        // dp[0]=0;
        dp[1]=0;
        dp[2]=Math.abs(height[1]-height[0]);
        for(int i=3;i<=n;i++){
            int left= dp[i-1]+Math.abs(height[i-1]-height[i-2]);
            int right= dp[i-2]+Math.abs(height[i-1]-height[i-3]);
            dp[i]=Math.min(left,right);
        }return dp[n];
        
    }
}