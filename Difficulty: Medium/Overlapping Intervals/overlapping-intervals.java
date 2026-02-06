class Solution {
    public ArrayList<int[]> mergeOverlap(int[][] arr) {
        Arrays.sort(arr,(a,b) -> a[0] - b[0]);
        ArrayList<int[]> res = new ArrayList<>();
        res.add(arr[0]);
        for(int i=1;i<arr.length;i++){
            int[] prev = res.get(res.size()-1);
            int[] curr = arr[i];
            if(curr[0] <= prev[1]){
                prev[1] = Math.max(prev[1], curr[1]); 
            } 
            else {
                res.add(curr);
            }
        }

        return res;
    }
}