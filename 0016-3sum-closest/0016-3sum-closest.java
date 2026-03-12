class Solution {
    int[] arr;
    int t;
    public int threeSumClosest(int[] nums, int target) {
        arr=nums;
        t=target;
    
        return fun(0,0,0);
    }
    public int fun(int ind,int sum,int cnt){
        // if(sum==t && cnt==3)return sum;
        if(cnt==3)return sum;
        if(ind==arr.length)return (int)(1e9);

        int pick=fun(ind+1,sum+arr[ind],cnt+1);
        if(pick==t)return t;
        int np= fun(ind+1,sum,cnt);
        int pdiff=Math.abs(pick-t);
        int npdiff=Math.abs(np-t);
        return pdiff>npdiff?np:pick;
    }
}