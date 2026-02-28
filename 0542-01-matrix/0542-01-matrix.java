class pair{
    int x;
    int y;
    pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public int[][] updateMatrix(int[][] mat) {
        int m=mat.length;
        int n=mat[0].length;
        Queue<pair> q=new LinkedList<>();
        boolean[][] vis=new boolean[m][n];
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(mat[i][j]==1)q.add(new pair(i,j));
                else vis[i][j]=true;
            }
        }
        int[] dx={0,0,-1,1};
        int[] dy={-1,1,0,0};
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                pair node=q.poll();
                int min=Integer.MAX_VALUE;
                for(int k=0;k<4;k++){
                    int nx=node.x+dx[k];
                    int ny=node.y+dy[k];
                    if(nx>=0 && ny>=0 && nx<m && ny<n){
                        // if(mat[nx][ny]==0)
                        if(vis[nx][ny] || mat[nx][ny]==0)
                        min= Math.min(min,mat[nx][ny]+1);
                        


                    }

                }
                mat[node.x][node.y]=min;
                vis[node.x][node.y]=true;
            }
        }return mat;

    }
}