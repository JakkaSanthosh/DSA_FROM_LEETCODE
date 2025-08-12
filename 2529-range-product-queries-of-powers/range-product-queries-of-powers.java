class Solution {
    public int[] productQueries(int n, int[][] queries) {
        List<Integer> al = new ArrayList<>();
        int c = 0;
        while (n != 0) {
            if (checkBit(n, 0)) {
                al.add(1<<c);
            }
            c++;
             n >>= 1;
        }
        int a[] = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            long prod = 1;
            int low = queries[i][0], high = queries[i][1];
            while (low <= high) {
                prod = (prod * al.get(low++)) % ((int) 1e9 + 7);
            }
            a[i] = (int) prod;
        }
        return a;
    }

    static boolean checkBit(int n, int i) {
        return (n & 1) != 0;
    }
}