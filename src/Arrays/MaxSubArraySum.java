package Arrays;

public class MaxSubArraySum {
    public static long findSum(int[] nums){
        int n = nums.length;
        long maxSum = Long.MIN_VALUE;
        long sum = 0;
        for(int i = 0; i < n ; i++) {
            sum += nums[i];
            if (sum > maxSum) {
                maxSum = sum;
            }
            if (sum < 0) {
                sum = 0;
            }
        }
        return maxSum;
    }
    public static void main(String[] args) {
        int[] nums = {2,1,4,1,6,7};
        System.out.println("Maximum sum : " + findSum(nums));
    }
}
