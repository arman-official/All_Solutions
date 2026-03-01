class Solution {
    public String findOrder(String[] words) {
        // code here
        ArrayList<ArrayList<Integer>> adj=new ArrayList<>();
        for(int i = 0; i < 26; i++){
            adj.add(new ArrayList<>());
        }
        int[] indegree=new int[26];
        boolean[] present=new boolean[26];
        for(String word:words){
            for(char c:word.toCharArray()){
                present[c-'a']=true;
            }
        }
        for(int i=0;i<words.length-1;i++){
            String w1= words[i];
            String w2= words[i+1];
            int len=Math.min(w1.length(),w2.length());
            boolean foundDiff=false;
            for(int j=0;j<len;j++){
                if(w1.charAt(j)!=w2.charAt(j)){
                    int u=w1.charAt(j)-'a';
                    int v=w2.charAt(j)-'a';
                    adj.get(u).add(v);
                    indegree[v]++;
                    foundDiff=true;
                    break;
                }
            }
            if(!foundDiff && w1.length()>w2.length()){
                return "";
            }
        }
            Queue<Integer> q=new LinkedList<>();
            for(int k=0;k<26;k++){
                if(present[k] && indegree[k]==0){
                    q.add(k);
                }
            }
            StringBuilder ans=new StringBuilder();
            while(!q.isEmpty()){
                int node= q.poll();
                ans.append((char)(node+'a'));
                for(int nbr:adj.get(node)){
                    indegree[nbr]--;
                    if(indegree[nbr]==0){
                        q.add(nbr);
                    }
                }
            }
            
            int totalChar=0;
            for(boolean b:present){
                if(b)totalChar++;
            }
            if(ans.length()!=totalChar){
                return "";
            }
            return ans.toString();
    }
}