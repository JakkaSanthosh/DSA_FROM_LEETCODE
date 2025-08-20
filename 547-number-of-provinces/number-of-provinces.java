class Solution {
    public int findCircleNum(int[][] isConnected) {
        int n=isConnected.length;
        List<List<Integer>> adj=new ArrayList<>();
        for(int i=0;i<=n;i++) adj.add(new ArrayList<>());
        int vis[]=new int[n+1];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(isConnected[i][j]==1&&i!=j){
                    adj.get(i+1).add(j+1);
                    adj.get(j+1).add(i+1);
                }
            }
        }
        int cnt=0;
        for(int i=1;i<=n;i++){
            if(vis[i]==0){
                cnt++;
                dfs(i,vis,adj);
            }
        }
        return cnt;
    }
    static void dfs(int node,int vis[],List<List<Integer>> adj){
        vis[node]=1;
        for(var i:adj.get(node)){
            if(vis[i]==0) dfs(i,vis,adj);
        }
    }
}