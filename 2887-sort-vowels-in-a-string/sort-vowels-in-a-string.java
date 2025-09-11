class Solution {
    public String sortVowels(String s) {
        StringBuilder sb = new StringBuilder();
        List<Character> al = new ArrayList<>();
        for (var i : s.toCharArray()) {
            if ("AEIOUaeiou".contains(i + ""))
                al.add(i);
        }
        Collections.sort(al);
        int k = 0;
        for (var i : s.toCharArray()) {
            if ("AEIOUaeiou".contains(i + ""))
                sb.append(al.get(k++));
            else
                sb.append(i);
        }
        return sb.toString();
    }
}