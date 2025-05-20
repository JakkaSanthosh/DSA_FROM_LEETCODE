class Solution {
    public int countDaysTogether(String arriveAlice, String leaveAlice, String arriveBob, String leaveBob) {
         int a[]={0,31,28,31,30,31,30,31,31,30,31,30,31};
         int sum=0;
        if(arriveBob.compareTo(leaveAlice)>0||arriveAlice.compareTo(leaveBob)>0) return 0;
        else if(arriveBob.compareTo(leaveAlice)==0||arriveAlice.compareTo(leaveBob)==0) return 1;
        String start=arriveAlice.compareTo(arriveBob)>0?arriveAlice:arriveBob;
        String end=leaveAlice.compareTo(leaveBob)>0?leaveBob:leaveAlice;
        int startMonth=Integer.parseInt(start.substring(0,2));
        int endMonth=Integer.parseInt(end.substring(0,2));
        int startDate=Integer.parseInt(start.substring(3));
        int endDate=Integer.parseInt(end.substring(3));
        if(startMonth==endMonth) return endDate-startDate+1;
        sum=endDate+a[startMonth]-startDate+1;
        for(int i=startMonth+1;i<endMonth;i++) sum+=a[i];
        return sum;
    }
}