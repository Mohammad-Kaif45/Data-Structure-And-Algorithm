package Arrays;
import java.util.Arrays;
import java.util.PriorityQueue;

public class K_thSmallest {
    public static int findKthSmallest(int[] nums,int k){
        int n = nums.length;
        if(k > n) return -1;
        PriorityQueue<Integer> maxHeap=new PriorityQueue<>((a, b) -> b - a);
        for(int i=0;i<nums.length;i++){
            maxHeap.add(nums[i]);
            if(maxHeap.size()>k){
                maxHeap.poll();
            }
        }
        return maxHeap.peek();
    }
    public static void main(String[] args) {
        int[] nums = {2,5,7,3,8};
        System.out.println("K-th Smallest element is : " + findKthSmallest(nums,6));

    }
}
