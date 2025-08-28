class Solution {
    public int[][] sortMatrix(int[][] grid) {
        List<List<Integer>> l=new ArrayList<>();
        List<Integer> t=new ArrayList<>();
        int r=grid.length;
        int c=grid[0].length;
        for(int x=r-1;x>=0;x--){
            int j=0,i=x;
            
            while(i>=0 && j>=0 && i<r && j<c){
                t.add(grid[i][j]);
                i++;j++;
            }
            Collections.sort(t,Collections.reverseOrder());
            l.add(t);
            t=new ArrayList<>();
        }

        for(int y=1;y<c;y++){
            int i=0,j=y;
             while(i>=0 && j>=0 && i<r && j<c){
                t.add(grid[i][j]);
                i++;j++;
            }
            Collections.sort(t);
            l.add(t);
            t=new ArrayList<>();
            
        }
        int p=0;
        for(int i=r-1;i>=0;i--){
        find(grid,l,i,p++);
        }
        int p1=r;
        for(int i=1;i<c;i++){
            find1(grid,l,i,p1++);
        }
        for(var i:l)
            System.out.println(i);
        return grid;
    }
    void find(int a[][],List<List<Integer>> l,int x,int y){
        
          
        int r=a.length,c=a[0].length;
        int k=0;
            int i=x,j=0;
            while(i>=0 && j>=0 && i<r && j<c){
               a[i][j]=l.get(y).get(k++);
                i++;j++;
            }
           return ;
        }
    void find1(int a[][],List<List<Integer>> l,int x,int y){
        int r=a.length,c=a[0].length;
        int k=0;
        int i=0,j=x;
        while(i>=0 && j>=0 && i<r && j<c){
                a[i][j]=l.get(y).get(k++);
                i++;j++;
            }
        return ;
    }
    }