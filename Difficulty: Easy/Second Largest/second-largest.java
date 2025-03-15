//{ Driver Code Starts
// Initial Template for Java
import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int t = Integer.parseInt(sc.nextLine());
        while (t-- > 0) {
            String[] arr1Str = sc.nextLine().split(" ");
            int[] arr = Arrays.stream(arr1Str).mapToInt(Integer::parseInt).toArray();
            Solution ob = new Solution();
            int ans = ob.getSecondLargest(arr);
            System.out.println(ans);

            System.out.println("~");
        }
    }
}

// } Driver Code Ends


// User function Template for Java

class Solution {
    public int getSecondLargest(int[] arr) {
        if(arr.length < 2) return -1;
        int m1 = 0 , m2 = 0;
        for(int i=0;i<arr.length;i++){
            if (arr[i] > m1){
		     m2  = m1;
		     m1 = arr[i];
	        }
	        else if (arr[i] > m2 && arr[i] < m1){
		        m2 = arr[i];
	        }
        }
        if(m2 == 0) return -1;
        return m2;
    }
}