package SlidingWindowAndTwoPointer;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacter {

    // Naive Approach : Calculate all substring and return maximum longest substring
    public static int longestSubstring(String str){
        int maxLen = Integer.MIN_VALUE;
        for(int i = 0; i < str.length(); i++){
            Set<Character> set = new HashSet<>();
            for(int j = i; j < str.length();j++){
                if(set.contains(str.charAt(j))){
                    maxLen = Math.max(maxLen,j - i);
                    break;
                }
                set.add(str.charAt(j));
            }
        }
        return maxLen;
    }

    // Optimal Approach : Use sliding window
    public static int lengthOfLongestSubstring(String str){
        HashMap<Character,Integer> map = new HashMap<>();
        int left = 0,right = 0;
        int n = str.length();
        int len = 0;
        while (right < n){
            if (map.containsKey(str.charAt(right))){
                left = Math.max(map.get(str.charAt(right)) + 1,left);
            }
            map.put(str.charAt(right),right);
            len =Math.max(len,right - left + 1);
            right++;
        }
        return len;
    }
    public static void main(String[] args) {
        String str = "abcabcca";
        int ans = longestSubstring(str);
        System.out.println("Length of longest substring without repeating character is : " + ans);
        int answer = lengthOfLongestSubstring(str);
        System.out.println("Length : " + answer);
    }
}
