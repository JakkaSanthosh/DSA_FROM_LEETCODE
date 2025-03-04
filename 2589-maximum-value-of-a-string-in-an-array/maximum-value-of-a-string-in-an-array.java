class Solution {
    public int maximumValue(String[] s) {
      int ans=0;
      for(int i=0;i<s.length;i++){
                   String str = s[i];

         try {
                // Try parsing the whole string as an integer
                int num = Integer.parseInt(str);
                ans = Math.max(ans, num);
            } catch (NumberFormatException e) {
                // If it's not a valid integer, take the length of the string
                ans = Math.max(ans, str.length());
            }
      } return ans; 
    }
}