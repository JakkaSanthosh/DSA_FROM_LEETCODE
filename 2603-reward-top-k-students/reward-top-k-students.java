class Solution {
    public List<Integer> topStudents(String[] positive_feedback, String[] negative_feedback, String[] report, int[] student, int k) {
        Set<String> pos = new HashSet<>();
        Set<String> neg = new HashSet<>();
        for (var i : positive_feedback)
            pos.add(i);
        for (var i : negative_feedback)
            neg.add(i);
        Map<Integer, Integer> mp = new HashMap<>();
        for (int i = 0; i < report.length; i++) {
            String a[] = report[i].split("\\s+");
            int score=0;
            for (var j : a) {
                if (pos.contains(j))
                    score+=3;
                else if (neg.contains(j))
                    score -= 1;
            }
            mp.put(student[i],score);
        }
        List<Integer> al = new ArrayList<>(mp.keySet());
        Collections.sort(al, (a, b) -> {
            if (mp.get(a) != mp.get(b))
                return mp.get(b) - mp.get(a);
            return a - b;
        });
        List<Integer> res = new ArrayList<>();
        for (int i = 0; i < k; i++)
            res.add(al.get(i));
        return res;
    }
}