package Arrays;

import java.util.PriorityQueue;

public class K_thLargest {
    public static int findKthLargest(int[] nums,int k){
        int n = nums.length;
        PriorityQueue<Integer> minHeap=new PriorityQueue<>();
        if(k > n) return -1;
        for(int i = 0; i < n; i++){
            minHeap.add(nums[i]);
            if(minHeap.size() > k){
                minHeap.poll();
            }

        }
        return minHeap.peek();
    }
    public static void main(String[] args) {
        int[] nums = {2,5,7,1,8};
        System.out.println("K-th Largest element is : " + findKthLargest(nums,3));
    }
}
