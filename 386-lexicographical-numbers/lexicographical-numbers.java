class Solution {
    public List<Integer> lexicalOrder(int n) {
        List<String> al = new ArrayList<>();
        for (int i = 1; i <= n; i++)
            al.add(i + "");
        Collections.sort(al, (a, b) -> {
            return a.compareTo(b);
        });
        List<Integer> res = new ArrayList<>();
        for (var i : al)
            res.add(Integer.parseInt(i));
        return res;
    }
}