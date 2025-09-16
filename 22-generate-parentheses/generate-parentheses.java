class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(0, 0, "", res, n);
        return res;
    }

    static void dfs(int oc, int cc, String path, List<String> al, int n) {
        if (oc == n && cc == n) {
            al.add(path);
            return;
        }
        if (oc < n)
            dfs(oc + 1, cc, path + "(", al, n);
        if (cc < oc)
            dfs(oc, cc + 1, path + ")", al, n);
    }
}