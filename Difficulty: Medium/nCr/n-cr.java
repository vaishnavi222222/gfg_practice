class Solution {
    public int ncr(int n,int r, int[][] dp){
        if(n == r || r == 0) return 1;
        if(dp[n][r] == -1){
            dp[n][r] = ncr(n-1,r,dp) + ncr(n-1,r-1,dp);
        }
        return dp[n][r];
    }
    public int nCr(int n, int r) {
        if(r > n) return 0;
        int[][] dp = new int[n+1][r+1];
        for(int i=0;i<n+1;i++){
            Arrays.fill(dp[i],-1);
        }
        return ncr(n,r,dp);
    }
}