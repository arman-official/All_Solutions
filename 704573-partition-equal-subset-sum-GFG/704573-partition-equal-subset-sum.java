class Solution {
    static boolean equalPartition(int arr[]) {
        // code here
        int sum1=0;
        int sum2=0;
        int ind=0;
        int sum=0;
        for(int i:arr)sum+=i;
        if(sum%2!=0)return false;
        int targetSum=sum/2;
        boolean[] dp=new boolean[targetSum+1];
        dp[0]=true; // 0 target alw possi.
        
        for(int num:arr){
            for(int j=targetSum; j>=num ;j--){
                dp[j]= dp[j]|| dp[j-num];
            }
        }
        return dp[targetSum];
    }
    // static boolean fun(int[] arr,int ind,int sum1,int sum2,Boolean[][][] dp,int sum){
    //     if(arr.length==ind)return sum1==sum2&&sum1>0 && sum2>0;
    //     if(dp[ind][sum1][sum2]!=null)return dp[ind][sum1][sum2];
    //     if(sum1>sum/2 || sum2>sum/2)return false;
    //     // pick by sum1 ,not by sum2
        
    //     //pick by sum2 , not by sum1
        
    //     //not pick by sum1 not by sum2
        
    //     return dp[ind][sum1][sum2]=fun(arr,ind+1,sum1+arr[ind],sum2,dp,sum)||fun(arr,ind+1,sum1,sum2+arr[ind],dp,sum);
    // }
}