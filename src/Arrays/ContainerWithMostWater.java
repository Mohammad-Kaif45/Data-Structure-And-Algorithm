package Arrays;

public class ContainerWithMostWater {
    public static int findContainer(int[] nums){ 
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        int maxWater = 0;
        while(left < right){ 
            int h = Math.min(nums[left],nums[right]);
            int width = right - left;  
            int area = h * width;
            maxWater = Math.max(maxWater,area); 
            if(nums[left] < nums[right]){
                left++;
            } else {
                right--;
            }
        }
        return maxWater;
    }
    public static void main(String[] args) {
        int[] nums = {1,8,6,2,5,4,8,3,7};
        System.out.println(findContainer(nums));
    }
}
