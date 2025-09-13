class Solution {
    public int maxFreqSum(String s) {
        int arr[] = new int[26];
        for (var i : s.toCharArray()) {
            int idx = i - 'a';
            arr[idx]++;
        }
        for(var i:arr) System.out.print(i+" ");
        int maxVow = 0, maxCon = 0;
        for (int i = 0; i < 26; i++) {
            if (i == 0 || i == 4 || i == 8 || i == 14 || i == 20)
                maxVow = Math.max(maxVow, arr[i]);
            else
                maxCon = Math.max(maxCon, arr[i]);
        }
        return maxVow + maxCon;
    }
}