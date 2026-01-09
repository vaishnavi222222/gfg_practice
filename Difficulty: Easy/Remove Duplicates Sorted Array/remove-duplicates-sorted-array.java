class Solution {
    // Function to remove duplicates from the given array.
    ArrayList<Integer> removeDuplicates(int[] arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int i = 0,j = 0;
        while(i<arr.length){
            list.add(arr[i]);
            while(i < arr.length && arr[i] == arr[j]){
                i++;
            }
            j = i;
        }
        return list;
    }
}
