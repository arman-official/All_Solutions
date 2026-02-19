class Solution {
    public int tribonacci(int n) {// Ti3= Ti-3
        if(n==0)return 0;
        int Ti3=0;
        int Ti2=1;
        int Ti1=1;
        int newT=0;
        for(int i=3;i<=n;i++){
            newT= Ti3+Ti2+Ti1;
            Ti3=Ti2;
            Ti2=Ti1;
            Ti1=newT;
        }return Ti1;
    }
}