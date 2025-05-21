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
        int num1 = 0, num2 = 0;
        for (int i = 0; i < al.size(); i++) {
            if (i % 2 == 0)
                num1 = num1 * 10 + al.get(i);
            else
                num2 = num2 * 10 + al.get(i);
        }
        return num1 + num2;
    }
}