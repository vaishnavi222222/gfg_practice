
class Solution {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        int l = 0,r = 0;
        int sum = arr[0];
        ArrayList<Integer> li = new ArrayList<>();
        while(l < arr.length && r < arr.length){
            if(sum == target){
                li.add(l+1);
                li.add(r+1);
                return li;
            }
            else if(sum < target && r < arr.length-1){
                sum += arr[r+1];
                r++;
            }else{
                sum -= arr[l];
                l++;
            }
        }
        if(li.size() == 0){
            li.add(-1);
        }
        return li;
    }
}
