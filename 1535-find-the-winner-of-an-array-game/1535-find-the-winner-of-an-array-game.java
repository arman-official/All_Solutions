class Solution {
    public int getWinner(int[] arr, int k) {
        Deque<Integer> q=new LinkedList<>();
        if(k==1)return arr[0]>arr[1]?arr[0]:arr[1];
        if(k>arr.length)return Arrays.stream(arr).max().getAsInt();

        for(int i:arr)q.addLast(i);
        int Gk=k-1;
        while(k>0){
            int currTop=q.removeFirst();
            int opponent=q.removeFirst();
            if(currTop>opponent){
                k--;
                q.addFirst(currTop);
                q.addLast(opponent);

            }else {
                k=Gk;
                q.addFirst(opponent);
                q.addLast(currTop);
            }
            if(k==0)return currTop;
        }
        return 0;
    }
}