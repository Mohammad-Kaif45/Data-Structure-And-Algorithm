package SlidingWindowAndTwoPointer;

import java.util.HashMap;

public class LongestRepeatingCharacterReplacement {

    // Naive Approach
    public static int longest(String str,int k){
        int n = str.length();
        int maxLen = 0;
        for(int i = 0; i < n; i++){
            int[] hash = new int[26];
            int maxFreq = 0;
            for(int j = i; j < n; j++){
                hash[str.charAt(j) - 'A']++;
                maxFreq = Math.max(maxFreq,hash[str.charAt(j)]);
                int changes = (j - i + 1) - maxFreq;
                if(changes <= k){
                    maxLen = Math.max(maxLen,j - i + 1);
                } else {
                    break;
                }
            }
        }
        return maxLen;
    }

    // Optimal : Sliding Window
    public static int characterReplacement(String str,int k){
        int n = str.length();
        int left = 0 , maxLen = 0, maxFreq = 0;
        int[] hash = new int[26];
        for(int right = 0; right < n; right++){
            hash[str.charAt(right) - 'A']++;
            maxFreq = Math.max(maxFreq,hash[str.charAt(right) - 'A']);
            while((right - left + 1) - maxFreq > k){
                hash[str.charAt(left) - 'A']--;
                left++;
            }
            maxLen = Math.max(maxLen,right - left + 1);
        }
        return maxLen;
    }
    public static void main(String[] args) {
        String str = "AABABBA";
        System.out.println("Longest substring with replacement at most k is : " + characterReplacement(str,1));
    }
}
