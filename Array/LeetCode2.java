//Given an array nums of integers, return how many of them contain an even number of digits.

class Even{
    public int evenN(int[] nums){
        int count = 0;

        for(int num: nums){
            int digit = String.valueOf(num).length();
            if(digit % 2 ==0){
                count++;
            }
        }
        return count;
    }
}

public class LeetCode2 {
    public static void main(String[] args) {
        Even e = new Even();
        int[] nums = {12,345,2,6,7896};
        System.out.println(e.evenN(nums));
    }
    
}
