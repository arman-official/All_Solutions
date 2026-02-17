class Solution {

    static Boolean isSubsetSum(int arr[], int sum) {
        // code here
        int currSum=0;
        int ind=0;
        Boolean[][] dp=new Boolean[arr.length][sum+1];
        return fun(arr,sum,currSum,ind,dp);
        
    }static boolean fun(int[] arr,int sum,int currSum,int ind,Boolean[][] dp){
        
        if(sum==currSum)return true;
        if(ind==arr.length){
            return false;
        }
        if(currSum>sum)return false;
        
        if(dp[ind][currSum] != null)return dp[ind][currSum];
        return dp[ind][currSum]=fun(arr,sum,currSum+arr[ind],ind+1,dp)||fun(arr,sum,currSum,ind+1,dp);        
        
    }//not boolean 
    //Boolean by default stores null
}