class Solution {
    static List<Integer> firstNegInt(int arr[], int k) {
        // write code here
        ArrayList<Integer> l=new ArrayList<>();
        Queue<Integer> q=new LinkedList<>();
        int i=0,j=0;
        while(j<arr.length){
            if(arr[j]<0)q.add(arr[j]);
            
            if(j-i+1>=k){
                if(!q.isEmpty()){
                    l.add(q.peek());
                }else{
                    l.add(0);
                }
                if(!q.isEmpty() && q.peek()==arr[i])q.remove();
                
                i++;
            }
            j++;
        }
        return l;
    }
}