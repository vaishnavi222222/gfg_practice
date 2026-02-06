class Solution {
    public static int minCost(int[] arr) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i=0;i<arr.length;i++){
            pq.add(arr[i]);
        }
        int res = 0;
        while(pq.size() > 1){
            int c = pq.poll() + pq.poll();
            res += c;
            pq.add(c);
        }
        return res;
        
    }
}