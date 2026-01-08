class Solution {
    public int maxSubarraySum(int[] arr, int k) {
        int sum = 0;
        int max = 0;
        for(int i=0;i<k;i++){
            sum += arr[i];
        }
        max = sum;
        int l =0,r=k-1;
        while( r < arr.length-1){
            sum += arr[r+1];
            sum -= arr[l];
            r++;
            l++;
            max = Math.max(sum,max);
        }
        return  max;
        
    }
}