class Solution {
    public static boolean matSearch(int a[][], int k) {
        // your code here
        int j=0;
        int i=a.length-1;
        while(i>=0 && j<a[0].length){
            if(a[i][j]==k)return true;
            else if(a[i][j]<k)j++;
            else i--;
            
        }return false;
    }
}