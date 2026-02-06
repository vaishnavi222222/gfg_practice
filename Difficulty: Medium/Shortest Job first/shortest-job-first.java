// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<bt.length;i++){
            pq.add(bt[i]);
        }
        int t = 0;
        int tt = 0;
        while(pq.size() > 0){
            tt += t;
            t  += pq.poll();
        }
        return tt/bt.length;
    }
}
