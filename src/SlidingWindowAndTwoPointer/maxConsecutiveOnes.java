package SlidingWindowAndTwoPointer;

public class maxConsecutiveOnes {
    public static int solve(int[] nums,int k){
        int maxLen = 0;
        int n = nums.length;
        for(int i = 0; i < n; i++){
            int zeros = 0;
            for(int j = i; j < n; j++){
                if(nums[j] == 0){
                    zeros++;
                }
                if(zeros <= k){
                    int len = j - i + 1;
                    maxLen = Math.max(len,maxLen);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }

    // Optimal Solution :
    public static int longestOnes(int[] nums, int k) {
        int left = 0, right = 0, zeros = 0, maxLen = 0;
        while (right < nums.length) {
            // Increment the zero counter if the current element is 0
            if (nums[right] == 0) {
                zeros++;
            }
            // Shrink the window if zeros exceeds k
            while (zeros > k) {
                if (nums[left] == 0) {
                    zeros--;
                }
                left++;
            }
            // Calculate the length of the current window
            maxLen = Math.max(maxLen, right - left + 1);

            //Move the right pointer forward
            right++;
        }

        return maxLen;
    }

    public static void main(String[] args) {
        int[] nums = {1,1,1,0,0,0,1,1,1,1,0};
        int ans = longestOnes(nums,2);
        System.out.println("Length of max consecutove one after flipping the zeros by k operation is : " + ans);
    }
}

