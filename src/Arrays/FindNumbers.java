package Arrays;

import java.util.ArrayList;

public class FindNumbers {
    public static ArrayList findNumbers(int[] nums){
        ArrayList<Integer> list = new ArrayList<>();
        int n = nums.length;
        for(int i = 1; i < n; i++){
            if(nums[i] == nums[i - 1]){
                list.add(nums[i]);
                list.add(nums[i] + 1);
            }
        }

        return list;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,3,4,5,5,7,8};
        System.out.println(findNumbers(nums));
    }
}
