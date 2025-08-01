package Arrays;
import java.util.Arrays;
public class TwoSum {
        public static int[] findTwoSum(int[] arr,int target) {

        int n = arr.length;

        int[] ans = new int[2];
        ans[0] = ans[1] = -1;
        for(int i = 0; i < n; i++) {
            for(int j = i + 1; j < n; j++) {
                if(arr[i] + arr[j] == target) {
                    ans[0] = i;
                    ans[1] = j;
                    return ans;
                }
            }
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] nums = {1,4,7,2,6};
        System.out.println(Arrays.toString(findTwoSum(nums, 9)));
    }
}
