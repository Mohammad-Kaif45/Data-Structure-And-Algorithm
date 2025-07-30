package SlidingWindowAndTwoPointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class FruitsIntoBaskets {
    // Naive Approach
    public static int function(int[] nums){
        int n = nums.length;
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            Set<Integer> set = new HashSet<>();

            for(int j = i; j < n; j++){
                set.add(nums[j]);
                if(set.size() <= 2){
                    maxLen = Math.max(maxLen,j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }
    public static int longestSubarray(int[] nums){
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;
        int maxLen = 0;
        int left = 0;
        for(int right = 0; right < n; right++){
            map.put(nums[right],map.getOrDefault(nums[right] ,0) + 1);
            while(map.size() > 2){
                map.put(nums[right],map.get(nums[right]) - 1);
                if(map.get(nums[right]) == 0){
                    map.remove(nums[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen,right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        int[] nums = {1,2,1};
        System.out.println("Longest subarray : " + longestSubarray(nums));
    }
}