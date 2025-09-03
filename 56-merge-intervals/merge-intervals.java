class Solution {
    public int[][] merge(int[][] interval) {
        List<Integer> inner = new ArrayList<>();
        List<List<Integer>> outer = new ArrayList<>();
        Arrays.sort(interval, (a, b) -> {
            if (a[0] != b[0])
                return a[0] - b[0];
            return a[1] - b[1];
        });
        int start = interval[0][0], finish = interval[0][1];
        for (int i = 1; i < interval.length; i++) {
            if (interval[i][0] <= finish) {
                finish = Math.max(finish, interval[i][1]);
            } else {
                inner.add(start);
                inner.add(finish);
                outer.add(inner);
                start = interval[i][0];
                finish = interval[i][1];
                inner = new ArrayList<>();
            }
        }
        inner.add(start);
        inner.add(finish);
        outer.add(inner);
        int a[][] = new int[outer.size()][2];
        for (int i = 0; i < outer.size(); i++) {
            a[i][0] = outer.get(i).get(0);
            a[i][1] = outer.get(i).get(1);
        }
        return a;
    }
}