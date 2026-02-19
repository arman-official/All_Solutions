class pair{
    int x;
    int y;
    int dis;
    pair(int x,int y,int dis){
        this.x=x;
        this.y=y;
        this.dis=dis;
    }
}
class Solution {
    public int minStepToReachTarget(int knightPos[], int targetPos[], int n) {
        // Code here
        if(knightPos[0] == targetPos[0] &&
           knightPos[1] == targetPos[1])
            return 0;

        int[] dr={-1,-1,1,1,-2,-2,2,2};
        int[] dc={-2,2,-2,2,-1,1,-1,1};
        Queue<pair> q=new LinkedList<>();
        boolean[][] vis=new boolean[n+1][n+1];
        vis[knightPos[0]][knightPos[1]]=true;
        q.add(new pair(knightPos[0],knightPos[1],0));
        while(!q.isEmpty()){
            pair temp=q.remove();
            for(int i=0;i<8;i++){
                int dri=temp.x+dr[i];
                int dci=temp.y+dc[i];
                if(dri==targetPos[0]&&dci==targetPos[1]){
                    return temp.dis+1;
                }
                if(isValid(dri,dci,n)){
                    if(!vis[dri][dci]){
                    q.add(new pair(dri,dci,temp.dis+1));
                    vis[dri][dci]=true;
                    }
                    
                }
            }
        }return -1;
        
    }
    public boolean isValid(int x,int y,int n){
        if(x>=0 && x<n && y>=0 && y<n)return true;
        return false;
    }
}