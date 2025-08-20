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
        return dfs(source,destination,vis,mp);
    }
    static boolean dfs(int src,int des,int[] vis,Map<Integer,Set<Integer>> mp){
        if(src==des) return true;
        vis[src]=1;
        for(var i:mp.get(src)){
            if(vis[i]==0){
                if(dfs(i,des,vis,mp)) return true;
            }
        }
        return false;
    }
}