package SlidingWindowAndTwoPointer;

public class BinarySubArrayWithSum { 
    public static int numSubarrayWithSum(int[] nums,int goal){
        int n = nums.length; 
        int count = 0;
        int left = 0;
        int right = 0;
        int sum = 0;
        while(right <= n){
            sum += nums[right];
            count++;
            while(sum > goal){
                sum -= nums[left];
                left++;
            }
            count = Math.max(count,right - left + 1);
        }
        return count;
    }
    public static void main(String[] args) {
        int[] nums = {1, 1, 0, 1, 0, 0, 1};
        System.out.println("No of subarray whose sum is equal to goal is : " + numSubarrayWithSum(nums,3));
    }
}
