class Solution {
    public List<String> removeAnagrams(String[] words) {
        List<String> al = new ArrayList<>();
        al.add(words[0]);
        for (int i = 1; i < words.length; i++) {
            char a[] = words[i - 1].toCharArray();
            char b[] = words[i].toCharArray();
            Arrays.sort(a);
            Arrays.sort(b);
            if (!Arrays.equals(a, b))
                al.add(words[i]);
        }
        return al;
    }
}