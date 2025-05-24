class Solution {
    public String[] findRestaurant(String[] list1, String[] list2) {
        int min=Integer.MAX_VALUE;
        List<String> al=new ArrayList<>();
        for(int i=0;i<list1.length;i++){
            for(int j=0;j<list2.length;j++){
                if(list1[i].equals(list2[j])){
                    int sum=i+j;
                    if(sum<min){
                        min=sum;
                        al.clear();
                        al.add(list1[i]);
                    }else if(sum==min) al.add(list1[i]);
                }
            }
        }
        String a[]=new String[al.size()];
        for(int i=0;i<al.size();i++){
            a[i]=al.get(i);
        }
        return a;
            }
}