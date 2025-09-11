
//Given a binary array nums, return the maximum number of consecutive 1's in the array.

class Leet{
    public int findMax(int[] nums){
        int count = 0;
        int maxCount = 0;

        for(int num : nums){
            if(num == 1){
                count++;
                maxCount = Math.max(maxCount, count);
            } else {
                count = 0;
            }
        }
        return maxCount;
    }
}

public class LeetCode {
    public static void main(String[] args) {
        Leet leet = new Leet();
        int[] nums = {1,1,0,1};
        System.out.println(leet.findMax(nums));
        
    }
    
}
