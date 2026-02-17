class Solution {
    static int lis(int arr[]) {
        // code here
    int ind=0;
        // List<Integer> l=new ArrayList<Integer>();
        // int prevInd=0; u assume that first element is already taken
        int prevInd=-1;
        // int maxi=0;
        // for(int i:arr)maxi=Math.max(maxi,i);
        int[][] dp=new int[arr.length+1][arr.length+1];
        for(int[] i:dp)Arrays.fill(i,-1);
        return fun(arr,ind,prevInd,dp);
    }
    static int fun(int[] arr,int ind,int prevInd,int[][] dp){
        if(ind==arr.length)return 0;
        if(dp[ind][prevInd+1]!=-1)return dp[ind][prevInd+1];
        int np= fun(arr,ind+1,prevInd,dp);
        int pick=0;
        if(prevInd==-1 || arr[ind]>arr[prevInd]){ // here not +1 bec,we re accessing , not updating , and we dont update before access
            pick= 1+ fun(arr,ind+1,ind,dp);
        }

        return dp[ind][prevInd+1]=Math.max(pick,np);
    }
}