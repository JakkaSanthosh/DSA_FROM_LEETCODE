class Solution {
    public List<List<String>> suggestedProducts(String[] products, String searchWord) {
        List<List<String>> ans = new ArrayList<>();
        Arrays.sort(products, (a, b) -> a.compareTo(b));
        for (int i = 0; i < searchWord.length(); i++) {
            String s = searchWord.substring(0, i + 1);
            List<String> inner = new ArrayList<>();
            for (var j : products) {
                if (j.startsWith(s))
                    inner.add(j);
            }
            if (inner.size() >= 3)
                ans.add(inner.subList(0, 3));
            else
                ans.add(inner);
        }
        return ans;
    }
}
