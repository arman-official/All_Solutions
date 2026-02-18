// User function Template for Java

class Solution {
    public int unvisitedLeaves(int N, int leaves, int frogs[]) {
        // Code here
        int[] vis=new int[leaves];
        Arrays.fill(vis,1);
        for(int i=0;i<N;i++){
            int strength= frogs[i];
            if(strength>leaves || vis[strength-1]==0 )continue;
            for(int j=strength;j<=leaves;j+=strength){
                vis[j-1]=0;
            }
        }
        int sum=0;
        for(int i:vis)sum+=i;
        return sum;
    }
}
