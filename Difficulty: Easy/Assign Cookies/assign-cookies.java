class Solution {
    public int maxChildren(int[] greed, int[] cookie) {
        Arrays.sort(greed);
        Arrays.sort(cookie);
        int p1 = 0,p2 = 0;
        while(p1 < greed.length && p2 < cookie.length){
            if(cookie[p2] >= greed[p1]){
                p1++;
                p2++;
            } else if(greed[p1] > cookie[p2]){
                p2++;
            }
        }
        return p1; 
        
    }
}