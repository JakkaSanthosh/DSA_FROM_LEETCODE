class Solution {
    public int[] findXSum(int[] a, int k, int x) {
        int s=0;
        int b[]=new int[a.length-k+1];
        int j=0;
     List<Integer> l=new ArrayList<>();
        for(int i=0;i<a.length;i++){
            l.add(a[i]);
            if(i>=k-1){
               int sum= find(l,x);
               b[j++]=sum;
               l.remove(0);
            }
           

        }
        return b;
    }
    public static int find(List<Integer> l,int x){
        int sum=0;
        int c[]=new int [100];
        for(var s:l){
            c[s]++;
        }
        while(x-->0){
            int max=Integer.MIN_VALUE,in=0;
            for(int i=0;i<c.length;i++){
                if(c[i]>=max){
                    max=c[i];
                    in=i;
                }
            }
            sum+=(in*max);
            c[in]=-1;
        }

        
return sum;

    }
}