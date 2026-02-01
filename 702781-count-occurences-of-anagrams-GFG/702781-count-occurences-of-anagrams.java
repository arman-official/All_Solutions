// User function Template for Java

class Solution {

    int search(String pat, String txt) {
        // code here
        int k=pat.length();
        int n=txt.length();
        HashMap<Character,Integer> hm=new HashMap<>();
        
        for(char c:pat.toCharArray()){
            hm.put(c,hm.getOrDefault(c,0)+1);
        }
        int count=pat.length();
        int i=0,j=0;
        int ans=0;
        
        while(j<n){
            char c= txt.charAt(j);
            
            if(hm.containsKey(c)){
                hm.put(hm.get(c)-1);
                if(hm.get(c)==0)count--;
            }
            
            if(j-i+1 < k)j++;
            
            else{
                if(count==0)ans++;
                
                char left= txt.charAt(i);
                
                if(hm.containsKey(left)){
                    i++;
                    if(i==1)count++;
                }
                i++;
                j++;
            }
        }
        
    }
}