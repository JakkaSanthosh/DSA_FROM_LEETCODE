class Solution {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
        Map<Integer,Set<Integer>> mp=new HashMap<>();
        for(int i=0;i<n;i++) mp.put(i,new HashSet<>());
        for(int i=0;i<edges.length;i++){
            int u=edges[i][0];
            int v=edges[i][1];
            mp.get(u).add(v);
            mp.get(v).add(u);
        }
        int vis[]=new int[n];
       // return dfs(source,destination,vis,mp);
        return bfs(source,destination,vis,mp);
    }
    static boolean bfs(int src,int des,int[] vis,Map<Integer,Set<Integer>> mp){
      Queue<Integer> q=new LinkedList<>();
      if(src==des) return true;
      q.add(src);
      vis[src]=1;
      while(!q.isEmpty()){
        int curr=q.poll();
        for(var i:mp.get(curr)){
            if(i==des) return true;
            if(vis[i]==0){
                vis[i]=1;
                q.add(i);
            }
        }
      }
      return false;
    }
}