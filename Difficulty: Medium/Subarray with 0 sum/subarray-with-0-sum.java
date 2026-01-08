class Solution {
    // Function to check whether there is a subarray present with 0-sum or not.
    static boolean findsum(int arr[]) {
        int a =0;
        HashSet<Integer> set = new HashSet<>();
        set.add(0);
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0) return true;
            a += arr[i];
            if(set.contains(a)) return true;
            else set.add(a);
        }
        return false;
    }
}