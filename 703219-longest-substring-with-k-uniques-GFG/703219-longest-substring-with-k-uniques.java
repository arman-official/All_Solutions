class Solution {
    public int longestKSubstr(String s, int k) {
        // code here
        int i=0,j=0;
        int maxL=-1;
        HashMap<Character,Integer> m= new HashMap<>();
        while(j<s.length()){
            char r=s.charAt(j);
            m.put(r,m.getOrDefault(r,0)+1);
            
            while(m.size()>k){
                char left= s.charAt(i);
                m.put(left,m.get(left)-1);
                
                if(m.get(left)==0)m.remove(left);
                i++;
            }
            if(m.size()==k)
            maxL= Math.max(maxL,j-i+1);
            j++;
        }return maxL;
    }
}