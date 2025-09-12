
class Solution {
    public void duplicate(int[] arr){
        int n = arr.length;
        int zeros = 0;

        for(int num : arr){
            if(num == 0){
                zeros++;
            }
        }

        for(int i = n - 1; i >= 0; i--){
            if(arr[i] == 0){
                if(i + zeros < n){
                    arr[i + zeros] = 0;

                } 
                 zeros--;
                if (i + zeros < n) {
                    arr[i + zeros] = 0;
                }
            } else {
                if(i + zeros < n){
                    arr[i + zeros] = arr[i];
                }
            }
        }
    }
}



public class DuplicateZero{
    public static void main(String[] args) {
        Solution sol = new Solution();
        int[] arr = {1,0,2,3,0,4,5,0};

        sol.duplicate(arr);
        System.out.println(java.util.Arrays.toString(arr));

        
    }
}