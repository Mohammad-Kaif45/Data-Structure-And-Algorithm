package SearchingAndSortingAlgorithm;

public class ReturnIndex {
    public static int findPosition(int[] nums,int target){
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        while(left <= right){
            int mid = (left + right) / 2;
            if(nums[mid] == target) return mid;
            else if(nums[mid] > target) {
                right = mid - 1;

            } else {
                left = mid + 1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,6,7,9,10,14,18,19,22,25};
        System.out.println(findPosition(nums,18));
    }
}
