class Solution {
    public int distanceTraveled(int mainTank, int additionalTank) {
       if(mainTank<5) return mainTank*10;
       int c=0;
       while(mainTank>=5){
          c+=5;
          mainTank-=5;
          if(additionalTank!=0){
            mainTank+=1;
            additionalTank--;
          }
       } 
       return (c+mainTank)*10;
    }
}