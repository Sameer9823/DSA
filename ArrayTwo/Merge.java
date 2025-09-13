
class Sol{
    public void merge(int [] nums1, int m, int[] nums2, int n){
        int i = m-1;
        int j = n-1;
        int k = m+n-1;

        while(i >= 0 && j >= 0){
            if(nums1[i] > nums2[j]){
                nums1[k] = nums1[i];
                i--;
            } else {
                nums1[k] = nums2[j];
                j--;
            }
            k--;
        }
        while(j >= 0){
            nums1[k] = nums2[j];
            j--;
            k--;
        }
    }
}

public class Merge {
    public static void main(String[] args) {
        Sol sol = new Sol();
        int[] nums1 = {1,2,3,0,0,0};
        int[] nums2 = {2,5,6,7};
        int m = 3, n = 3;

        sol.merge(nums1, m, nums2, n);
        System.out.println(java.util.Arrays.toString(nums1));
        
    }
    
}
