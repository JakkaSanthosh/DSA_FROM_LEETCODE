class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        long volume=1L *length*width*height;
        String cat="";
        if(length>=10000||width>=10000||height>=10000||mass>=10000||volume>=1000000000) cat="Bulky";
      if(mass>=100&&cat.equals("Bulky")) return "Both";
      else if(mass!=100&&cat.equals("Bulky"))  return cat;
      else if(mass>=100&&!cat.equals("Bulky")) return "Heavy";
      return "Neither";
    }
}