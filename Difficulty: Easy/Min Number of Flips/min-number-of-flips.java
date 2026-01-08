class Solution {
    public int minFlips(String s) {
        int cnt = 0,cnt1=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0' && i%2 == 0){
                cnt++;
            }
            if(s.charAt(i) == '1' && i%2 != 0){
                cnt ++;
            }
        }
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1' && i%2 == 0){
                cnt1++;
            }
            if(s.charAt(i) == '0' && i%2 != 0){
                cnt1++;
            }
        }
        return Math.min(cnt,cnt1);
    }
}