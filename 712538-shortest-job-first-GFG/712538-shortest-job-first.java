// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        Arrays.sort(bt);
        int wt=0;
        int currSum=0;
        for(int i=0;i<bt.length;i++){
            wt=currSum+wt;
            currSum+=bt[i];
        }
        return (int)Math.floor(wt/bt.length);
        
    }
}
