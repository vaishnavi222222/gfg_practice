class Solution {
    public Queue<Integer> reverseFirstK(Queue<Integer> q, int k) {
        if(k > q.size()) return q;
        // code here
        Stack<Integer> s = new Stack<>();
        int i = 0;
        while(i < k){
            s.push(q.poll());
            i++;
        }
        while(!s.isEmpty()){
            q.add(s.pop());
        }
        int n = q.size() - k;
        while(n-- > 0){
            q.add(q.poll());
        }
        return q;
    }
}