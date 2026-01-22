class Solution {
    public int minimumPairRemoval(int[] nums) {
        int c = 0;
        boolean x = true;
        List<Integer> l = new ArrayList<>();
        for (var s : nums) {
            l.add(s);
        }
        while (x) {
            if (sorted(l))
                return c;
            int id[] = merge(l);
            l.remove(id[0] + 1);
            l.remove(id[0]);
            l.add(id[0], id[1]);
            c++;
        }
        return c;
    }

    public boolean sorted(List<Integer> l) {
        for (int i = 0; i < l.size() - 1; i++) {
            if (l.get(i) > l.get(i + 1))
                return false;
        }
        return true;
    }

    public int[] merge(List<Integer> l) {
        int sum = Integer.MAX_VALUE, id = -1;
        for (int i = 0; i < l.size() - 1; i++) {
            int y = l.get(i) + l.get(i + 1);
            if (y < sum) {
                sum = y;
                id = i;
            }
        }
        int a[] = new int[2];
        a[1] = sum;
        a[0] = id;
        return a;
    }
}