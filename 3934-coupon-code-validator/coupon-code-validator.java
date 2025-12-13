class Solution {
    public List<String> validateCoupons(String[] code, String[] businessLine, boolean[] isActive) {
          Map<String, Integer> priority = Map.of(
            "electronics", 1,
            "grocery", 2,
            "pharmacy", 3,
            "restaurant", 4
        );
        List<String[]> valid = new ArrayList<>();
        for (int i = 0; i < code.length; i++) {
            if (!code[i].isEmpty() && isActive[i] && check(code[i])) {
                if (priority.containsKey(businessLine[i])) {
                    valid.add(new String[]{code[i], businessLine[i]});
                }
            }
        }
        valid.sort((a, b) -> {
            int p1 = priority.get(a[1]);
            int p2 = priority.get(b[1]);
            if (p1 != p2) return Integer.compare(p1, p2);
            return a[0].compareTo(b[0]); 
        });
        List<String> result = new ArrayList<>();
        for (String[] pair : valid) {
            result.add(pair[0]);
        }
        return result;
    }
 static boolean check(String s){
     for(char i:s.toCharArray()){
         if(i!='_'&&!Character.isLetter(i)&&!Character.isDigit(i)) return false;
     }
     return true;
 }
}