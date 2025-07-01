class Solution {
    public String decodeMessage(String key, String message) {
        int k=0;
        Map<Character,Character> mp=new HashMap<>();
      for(var i:key.toCharArray()){
        if(i!=' '&&!mp.containsKey(i)){
            mp.put(i,(char)(97+k));
            k++;
        }
      }
      StringBuilder sb=new StringBuilder();
      for(var i:message.toCharArray()){
        if(i==' ') sb.append(i);
        else sb.append(mp.get(i));
              }
              return sb.toString();
    }
}