// User function Template for Java
class pair{
    int x;
    int y;
    pair(int x,int y){
        this.x=x;
        this.y=y;
    }
}
class Solution {
    void bfs(int[][] grid,boolean[][] vis,int i,int j,ArrayList<String> ss){
        int m=grid.length;
        int n=grid[0].length;
        Queue<pair> q=new LinkedList<>();
        int[] dx = {0,0,-1,1};
        int[] dy = {-1,1,0,0};
        q.add(new pair(i,j));
        vis[i][j]=true;
        while(!q.isEmpty()){
            pair node = q.poll();
            int relativeX=node.x-i;
            int relativeY=node.y-j;
            ss.add(relativeX+" "+relativeY);
            for(int k = 0; k < 4; k++){
                int nx = node.x + dx[k];
                int ny = node.y + dy[k];

                if(nx>=0 && ny>=0 && nx<m && ny<n &&
                   grid[nx][ny]==1 && !vis[nx][ny]){

                    vis[nx][ny] = true;
                    q.add(new pair(nx,ny));
                }
            }
        }
    }
    int countDistinctIslands(int[][] grid) {
        // Your Code here
        int m=grid.length;
        int n=grid[0].length;
        boolean[][] vis=new boolean[m][n];
        HashSet<ArrayList<String>> s=new HashSet<>();
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1 && !vis[i][j]){
                    ArrayList<String> ss=new ArrayList<>();
                    bfs(grid,vis,i,j,ss);
                    s.add(ss);
                }
            }
        }
        return s.size();
    }
}
