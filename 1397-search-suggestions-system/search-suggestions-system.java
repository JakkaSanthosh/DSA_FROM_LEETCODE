class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        Trie t = new Trie();
        for (var i : products)
            t.insert(i);
        for (int i = 0; i < searchWord.length(); i++) {
            String s = searchWord.substring(0, i + 1);
            ans.add(t.search(s));
        }
        return ans;
    }
}

class Node {
    Node a[];
    boolean ew;

    public Node() {
        a = new Node[26];
        ew = false;
    }
}

class Trie {
    static Node root;

    public Trie() {
        root = new Node();
    }

    static void insert(String s) {
        Node temp = root;
        for (var i : s.toCharArray()) {
            int idx = i - 'a';
            if (temp.a[idx] == null)
                temp.a[idx] = new Node();
            temp = temp.a[idx];
        }
        temp.ew = true;
    }

    static List<String> search(String prefix) {
        List<String> res = new ArrayList<>();
        Node temp = root;
        for (var i : prefix.toCharArray()) {
            int idx = i - 'a';
            if (temp.a[idx] == null)
                return res;
            temp = temp.a[idx];
        }
        return dfs(prefix, res, temp);
    }

    static List<String> dfs(String path, List<String> res, Node temp) {
        if (res.size() == 3)
            return res;
        if (temp.ew)
            res.add(path);
        for (int i = 0; i < 26; i++) {
            if (temp.a[i] != null)
                dfs(path + (char) ('a' + i), res, temp.a[i]);
        }
        return res;
    }
}