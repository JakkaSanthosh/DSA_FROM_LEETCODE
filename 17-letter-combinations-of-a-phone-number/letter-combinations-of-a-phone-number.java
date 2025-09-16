class Solution {
    Map<String, String> mp;

    public Solution() {
        mp = new HashMap<>();
        mp.put("2", "abc");
        mp.put("3", "def");
        mp.put("4", "ghi");
        mp.put("5", "jkl");
        mp.put("6", "mno");
        mp.put("7", "pqrs");
        mp.put("8", "tuv");
        mp.put("9", "wxyz");
    }

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0)
            return new ArrayList<>();
        Queue<String> q = new LinkedList<>();
        String val = digits.charAt(0) + "";
        for (var i : mp.get(val).toCharArray()) {
            q.offer(i + "");
        }
        for (int i = 1; i < digits.length(); i++) {
            int n = q.size();
            while (n-- > 0) {
                String x = q.poll();
                for (var j : mp.get(digits.charAt(i) + "").toCharArray()) {
                    q.offer(x + j);
                }
            }
        }
        List<String> res = new ArrayList<>(q);
        return res;

    }
}