class pair{
    int x;
    int y;
    pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    public void solve(char[][] board) {
        int m=board.length;
        int n=board[0].length;
        Queue<pair> q=new LinkedList<>();
        for(int i=0;i<m;i++){
            if(board[i][0]=='O'){
                q.add(new pair(i,0));
                // board[i][0]='X';
            }
            if(board[i][n-1]=='O'){
                q.add(new pair(i,n-1));
                // board[i][n-1]='X';
            }
        }
        for(int i=0;i<n;i++){
            if(board[0][i]=='O')q.add(new pair(0,i));
            if(board[m-1][i]=='O')q.add(new pair(m-1,i));
        }
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(board[i][j]=='O')board[i][j]='N';
            }
        }
        
        int[] dx={0,0,-1,1};
        int[] dy={-1,1,0,0};
        while(!q.isEmpty()){
            pair node = q.poll();
            board[node.x][node.y]='O';
            for(int k=0;k<4;k++){
                int nx=node.x+dx[k];
                int ny=node.y+dx[k];
                if(nx>=0 && ny>=0 && nx<m && ny<n && board[nx][ny]=='N'){
                    q.add(new pair(nx,ny));
                    board[nx][ny]='O';
                }
            }
        }
        for(int i=1;i<m-1;i++){
            for(int j=1;j<n-1;j++){
                if(board[i][j]=='N')board[i][j]='X';
            }
        }
        // return board;

    }
}