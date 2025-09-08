class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> res = new ArrayList<>();
        for (var i : words) {
            StringBuilder sb = new StringBuilder();
            for (var j : i.toCharArray()) {
                if (j != separator)
                    sb.append(j);
                else if (j == separator && !sb.isEmpty()) {
                    res.add(sb.toString());
                    sb = new StringBuilder();
                }
            }
            if (!sb.isEmpty())
                res.add(sb.toString());
        }

        return res;
    }
}