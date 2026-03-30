class Solution {
    public boolean isIsomorphic(String s, String t) {
        char[] a=s.toCharArray();
        char[] tt=t.toCharArray();
        HashMap<Character,Character> m=new HashMap<>();
        HashMap<Character,Character> m2=new HashMap<>();
        
        for(int i=0;i<a.length;i++){
            char ac=a[i];
            char tc=tt[i];
            if(m.containsKey(tc)){

                if(m.get(tc)!=ac)return false;
                // if(m2.containsKey(ac)){
                    if(!m2.containsKey(ac)||m2.get(ac)!=tc)return false;
                // }
            }else{
                if(m2.containsKey(ac)){
                    return false;
                }
                m.put(tc,ac);
                m2.put(ac,tc);
            }
        }return true;
    }
}