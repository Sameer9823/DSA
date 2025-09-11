class SortedSquares{
    public int[] sort(int[] nums){
        int n = nums.length;
        int result []= new int[n];
        int left = 0, right = n - 1;
        int index = n - 1;

        while(left <= right){
            int leftSquare = nums[left] * nums[left];
            int rightSquare = nums[right] * nums[right];

            if(leftSquare > rightSquare){
                result[index--] = leftSquare;
                left++;
            } else {
                result[index--] = rightSquare;
                right--;
            }
        }
        return result;
    }
}

public class LeetCode3 {
    public static void main(String[] args) {
        SortedSquares ss = new SortedSquares();
        int[] nums = {-4,-1,0,3,10};
        int[] result = ss.sort(nums);
        for(int num : result){
            System.out.print(num + " ");
        }
    }
    
    
}
