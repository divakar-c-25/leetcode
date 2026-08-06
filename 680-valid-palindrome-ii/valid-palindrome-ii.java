class Solution {
    public boolean validPalindrome(String s) {
        int left=0,right=s.length()-1;
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return rem(s,left+1,right) || rem(s,left,right-1);
            }
            left++;
            right--;
        }return true;

    }
    private boolean rem(String s,int left,int right){
        while(left<right){
            if(s.charAt(left)!=s.charAt(right)){
                return false;
            }left++;
            right--;
        }return true;
    }
}