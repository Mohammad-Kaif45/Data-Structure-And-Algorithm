package Arrays;

public class InPlaceSort {
    public static void sortInPlace(int[] nums){
        int n = nums.length;
        int cnt0 = 0;
        int cnt1 = 0;
        int cnt2 = 0;
        for(int i = 0; i <n; i++){
            if(nums[i] == 0) cnt0++;
            else if(nums[i] == 1) cnt1++;
            else cnt2++;
        }

        for(int i = 0; i < cnt0; i++){
            nums[i] = 0;
        }
        for(int i = cnt0; i < cnt0+cnt1; i++){
            nums[i] = 1;
        }
        for(int i = cnt0+cnt1; i < n; i++){
            nums[i] = 2;
        }
        for(int i = 0; i < n; i++){
            System.out.print(nums[i] + " ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {1,1,0,0,1,0,2,0,1,2,1};
        sortInPlace(nums);
    }
}
