package SearchingAndSortingAlgorithm;

import java.util.*;
public class MedianOfArray {
    public static int[] merge(int[] nums1,int[] nums2) {
        int[] merged = new int[nums1.length + nums2.length];
        int i = 0,j = 0,k = 0;
        while(i < nums1.length && j < nums2.length) {
            if(nums1[i] < nums2[j]) {
                merged[k++] = nums1[i++];
            } else {
                merged[k++] = nums2[j++];
            }
        }
        while(i < nums1.length) {
            merged[k++] = nums1[i++];
        }
        while(j < nums2.length) {
            merged[k++] = nums2[j++];
        }
        return merged;
    }
    public static double midean(int[] merged) {
        int n = merged.length;
        if (n % 2 == 1) {
            // If the length is odd, return the middle element
            return merged[n / 2];
        } else {
            // If the length is even, return the average of the two middle elements
            return (merged[n / 2 - 1] + merged[n / 2]) / 2.0;
        }
    }
    public static void main(String[] args) {
        int[] nums1 = {1,3};
        int[] nums2 = {2,4,5};
        int[] mergedArray = merge(nums1, nums2);

        System.out.println("Merged Array: " + Arrays.toString(mergedArray));
        System.out.println("Median of two sorted arrays is : " + midean(merge(nums1,nums2)));
    }
}

