class Solution {
    boolean isPalindrome(String s) {
        // code here
        int p1 = 0,p2 = s.length()-1;
        while(p1 < p2){
            if(s.charAt(p1) != s.charAt(p2)) return false;
            else {
                p1++;
                p2--;
            }
        }
        return true;
    }
}