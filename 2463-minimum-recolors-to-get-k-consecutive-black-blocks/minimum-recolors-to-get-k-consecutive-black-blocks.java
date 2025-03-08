class Solution {
    public int minimumRecolors(String b, int k) {
        int ans=0;
        Map<Character,Integer> mp=new HashMap<>();
        for(int i=0;i<k;i++){
          char c=b.charAt(i);
          mp.put(c,mp.getOrDefault(c,0)+1);
        }
        ans=mp.getOrDefault('W',0);
        for(int i=1;i<b.length()-k+1;i++){
            char x=b.charAt(i-1);
            char y=b.charAt(i+k-1);
            mp.put(y,mp.getOrDefault(y,0)+1);
            mp.put(x,mp.getOrDefault(x,0)-1);
            if(mp.get(x)<=0) mp.remove(x);
            ans=Math.min(ans,mp.getOrDefault('W',0));
        }
        return ans;
    }
}
// import java.util.HashMap;
// import java.util.Map;

// class Solution {
// public int minimumRecolors(String b, int k) {
// int ans;
// Map<Character, Integer> mp = new HashMap<>();

// // Initialize the first window
// for (int i = 0; i < k; i++) {
// char c = b.charAt(i);
// mp.put(c, mp.getOrDefault(c, 0) + 1);
// }

// ans = mp.getOrDefault('W', 0); // Ensure we handle cases where 'W' might not exist

// // Sliding window
// for (int i = 1; i <= b.length() - k; i++) {
// char x = b.charAt(i - 1);    // Character going out of the window
// char y = b.charAt(i + k - 1); // Character coming into the window

// // Remove left character
// mp.put(x, mp.get(x) - 1);
// if (mp.get(x) == 0) mp.remove(x);

// // Add right character
// mp.put(y, mp.getOrDefault(y, 0) + 1);

// // Update answer
// ans = Math.min(ans, mp.getOrDefault('W', 0));
// }

// return ans;
// }
// }
