class Solution {
    public String freqAlphabets(String s) {
        StringBuilder x = new StringBuilder();

        for (int i = 0; i < s.length(); ) {
            if (i + 2 < s.length() && s.charAt(i + 2) == '#') {
                String k = s.substring(i, i + 2);  
                x.append((char)(Integer.parseInt(k) + 96));
                i += 3; 
            } else {
                x.append((char)(s.charAt(i) - '0' + 96));
                i++;
            }
        }

        return x.toString();
    }
}
