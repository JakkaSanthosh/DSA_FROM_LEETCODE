class Solution {
    public List<String> printVertically(String s) {
        String a[] = s.split(" ");
        List<String> res = new ArrayList<>();
        int max = 0;
        for (int i = 0; i < a.length; i++) {
            max = Math.max(max, a[i].length());
        }
        for (int i = 0; i < max; i++) {
            String x = "";
            for (int j = 0; j < a.length; j++) {
                if (i < a[j].length())
                    x += a[j].charAt(i);
                else
                    x += " ";
            }
            if (x.charAt(x.length() - 1) == ' ') {
                int j = x.length() - 1;
                for (; j >= 0; j--) {
                    if (x.charAt(j) != ' ')
                        break;
                }
                x = x.substring(0, j + 1);
            }
            res.add(x);
        }
        return res;
    }
}