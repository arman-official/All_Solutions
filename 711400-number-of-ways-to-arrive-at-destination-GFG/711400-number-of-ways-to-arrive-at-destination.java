// class tuple{
//     int stop;
//     int dis;
//     int node;
//     tuple(int stop,int dis,int node){
//         this.stop=stop;
//         this.dis=dis;
//         this.node=node;
//     }
// }
class pair{
    long dis;
    int node;
    pair(long x,int y){
        dis=x;
        node=y;
    }
}

class Solution {
    int MOD = (int)(1e9 + 7);

    public int countPaths(int V, int[][] edges) {

        ArrayList<ArrayList<pair>> adj = new ArrayList<>();
        for(int i=0;i<V;i++) adj.add(new ArrayList<>());

        for(int i=0;i<edges.length;i++){
            adj.get(edges[i][0]).add(new pair(edges[i][2], edges[i][1]));
            adj.get(edges[i][1]).add(new pair(edges[i][2], edges[i][0]));
        }

        PriorityQueue<pair> pq =
            new PriorityQueue<>((a,b)-> Long.compare(a.dis,b.dis));

        long[] dist = new long[V];
        Arrays.fill(dist, Long.MAX_VALUE);

        int[] ways = new int[V];

        dist[0] = 0;
        ways[0] = 1;

        pq.add(new pair(0,0));

        while(!pq.isEmpty()){
            pair curr = pq.poll();
            long currdis = curr.dis;
            int currnode = curr.node;

            if(currdis > dist[currnode]) continue;

            for(pair it : adj.get(currnode)){
                long newDist = currdis + it.dis;
                int adjNode = it.node;

                if(dist[adjNode] > newDist){
                    dist[adjNode] = newDist;
                    ways[adjNode] = ways[currnode];
                    pq.add(new pair(newDist, adjNode));
                }
                else if(dist[adjNode] == newDist){
                    ways[adjNode] =
                        (ways[adjNode] + ways[currnode]) % MOD;
                }
            }
        }

        return ways[V-1];
    }
}