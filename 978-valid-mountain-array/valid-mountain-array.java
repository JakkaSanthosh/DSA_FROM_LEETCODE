class Solution {
    public boolean validMountainArray(int[] arr) {
        for(int i=1;i<arr.length-1;i++){
            int k=i-1;
            while(k>=0){
                if(arr[k]>=arr[k+1]) break;
                k--;
            }
            int k1=i;
            while(k1<arr.length-1){
                if(arr[k1]<=arr[k1+1]) break;
                k1++;
            }
            System.out.println(k+" "+k1);
            if(k==-1&&k1==arr.length-1) return true;
        }
        return false;
    }
}