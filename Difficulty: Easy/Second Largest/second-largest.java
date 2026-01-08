class Solution {
    public int getSecondLargest(int[] arr) {
        int fl = arr[0];
        int sl = -1;
        for(int i=0;i<arr.length;i++){
            if(arr[i] > fl ){
                sl = fl;
                fl = arr[i];
            }else if(arr[i] > sl && arr[i] != fl) sl = arr[i];
        }
        return sl;
        
    }
}