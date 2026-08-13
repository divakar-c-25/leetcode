class Solution {        int count=0;
    public int countSubstrings(String s) {
        int n = s.length();
        if(s==null || n==0) return 0;
        for (int i=0; i <n; i++) {
            expand(s, i, i);
            expand(s, i, i + 1);
        }
        return count;
    }
        private void expand(String s, int left, int right) {
      
        while (left >= 0 && right < s. length() && s.charAt(left) == s.charAt(right)) {
        count++;
        left --;
        right++;
        }
    }
}