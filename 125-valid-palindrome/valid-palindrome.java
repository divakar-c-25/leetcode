class Solution {
    public boolean isPalindrome(String s) {
       int l=0;
       int r= s.length() -1;
       while(l<r){
        char left=s.charAt(l);
        char right=s.charAt(r);
        if(!isalnum(left)){
            l++;
        }else if(!isalnum(right)){
            r--;
        }else{
            if(Character.toLowerCase(left)!=Character.toLowerCase(right)){
                return false;
            }l++;
            r--;
        }
       }return true;
    }
    private boolean isalnum(char ch){
        return (ch>='a'&&ch <='z')||(ch>='A'&&ch<='Z')||(ch>='0'&&ch<='9');
    }
}