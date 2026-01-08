class Solution {
    public void mergeArrays(int a[], int b[]) {
        for(int i=0;i<b.length;i++){
            for(int j=0;j<a.length;j++){
                if(a[j] > b[i]){
                    int temp = a[j];
                    a[j] = b[i];
                    b[i] = temp;
                }
            }
        }
        Arrays.sort(b);
    }
}
