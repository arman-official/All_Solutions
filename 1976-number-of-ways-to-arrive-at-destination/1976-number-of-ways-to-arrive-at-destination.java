class pair{
    long a;
    int b;
    pair(long a,int b){
        this.a=a;
        this.b=b;
    }
}
class Solution {
    public int countPaths(int n, int[][] roads) {
        ArrayList<ArrayList<pair>> adj=new ArrayList<>();
        // for(int i=0;i<roe)
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<pair>());
        }
        for(int i=0;i<roads.length;i++){
            adj.get(roads[i][0]).add(new pair(roads[i][2],roads[i][1]));
            adj.get(roads[i][1]).add(new pair(roads[i][2],roads[i][0]));
        }
        long[] dis=new long[n];
        int[] way=new int[n];
        Arrays.fill(dis,Integer.MAX_VALUE);
        Arrays.fill(way,0);
        int mod= (int)(1e9+7);
        way[0]=1;
        dis[0]=0;
        PriorityQueue<pair> pq=new PriorityQueue<>((x,y)->Long.compare(x.a,y.a));
        pq.add(new pair(0,0));
        while(!pq.isEmpty()){
            pair p=pq.remove();
            long pa=p.a;
            int pb=p.b;
            if(pa>dis[pb])continue;
            for(pair nbr:adj.get(pb)){
                // if(dis[nbr.b]<dis[pb])continue;
                if(dis[nbr.b]>dis[pb]+nbr.a){
                    dis[nbr.b]=dis[pb]+nbr.a;
                    way[nbr.b]=way[pb];
                    pq.add(new pair(dis[nbr.b],nbr.b));
                }else if(dis[nbr.b]==dis[pb]+nbr.a){
                    way[nbr.b]= (way[nbr.b]+way[pb])%mod;
                }
            }
        }
        return way[n-1]%mod;

    }
}