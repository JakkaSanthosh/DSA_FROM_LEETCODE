class Solution {
    public String replaceWords(List<String> dictionary, String sentence) {
        Set<String> hs = new HashSet<>();
        for (var i : dictionary)
            hs.add(i);
        String a[] = sentence.split("\\s+");
        String res = "";
        for (int i = 0; i < a.length; i++) {
            String s = a[i];
            String x = "";
            int f = 0;
            for (var k : hs) {
                if (s.startsWith(k)) {
                    if (x.isEmpty() || k.length() < x.length())
                        x = k;
                    f = 1;
                }
            }
            if (f == 0)
                res += s;
            else
                res += x;
            if (i < a.length - 1)
                res += " ";
        }
        return res;
    }
}