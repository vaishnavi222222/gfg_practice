//Back-end complete function Template for Java

class Solution {
    static int minCostClimbingStairs(int[] cost) {
        int n = cost.length;
        int t1 = cost[0],t2 =cost[1];
        for(int i=2;i<cost.length;i++){
          int curr = cost[i]+Math.min(t1,t2);
          t1 = t2;
          t2 = curr;
        }
        return Math.min(t1,t2);
        
    }
};