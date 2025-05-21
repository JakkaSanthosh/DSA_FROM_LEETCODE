class Solution {
    public int splitNum(int num) {
        List<Integer> al = new ArrayList<>();
        while (num != 0) {
            int r = num % 10;
            if (r != 0)
                al.add(r);
            num /= 10;
        }
        Collections.sort(al);
        String x = "", y = "";
        for (int i = 0; i < al.size(); i++) {
            if (i % 2 == 0)
                x += al.get(i);
            else
                y += al.get(i);
        }
        if (x.equals(""))
            x = "0";
        if (y.equals(""))
            y = "0";
        return Integer.parseInt(x) + Integer.parseInt(y);
    }
}