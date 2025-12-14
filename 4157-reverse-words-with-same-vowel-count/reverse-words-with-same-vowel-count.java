class Solution {
    public String reverseWords(String s) {
        String a[] = s.split("\\s+");
        Map<String, Integer> mp = new HashMap<>();
        int fvc = 0, f = 0;
        for (var i : a) {
            int vc = 0;
            for (var j : i.toCharArray()) {
                if ("aeiou".contains(j + ""))
                    vc++;
            }
            if (f == 0) {
                f = 1;
                fvc = vc;
            }
            mp.put(i, vc);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < a.length; i++) {
            if (i == 0)
                sb.append(a[i]);
            else if (mp.get(a[i]) == fvc) {
                sb.append((new StringBuilder(a[i])).reverse());
            } else
                sb.append(a[i]);
            if (i < a.length - 1)
                sb.append(" ");
        }
        return sb.toString();
    }
}