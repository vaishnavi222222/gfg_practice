class Solution {
    public void sort012(int[] arr) {
        int n = arr.length;
        int low = 0,mid=0,high = n-1;
        while(mid <= high){
            if(arr[mid] == 0) {
                int temp =arr[mid];
                arr[mid] = arr[low];
                arr[low] = temp;
                low++;
                mid++;
            }
            else if(arr[mid] == 2){
                int temp =arr[mid];
                arr[mid] = arr[high];
                arr[high] = temp;
                high--;
            }
            else {
                mid++;
            }
        }
        
    }
}