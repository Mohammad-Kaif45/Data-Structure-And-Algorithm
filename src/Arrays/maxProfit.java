package Arrays;
// Buy and sell
public class maxProfit {
    public static int buyAndSell(int[] nums){
        int n = nums.length;
        int buy = nums[0];
        int profit = 0;
        for(int i = 1; i < n; i++){
            if(nums[i] > buy){
                buy = nums[i];
            } else if(nums[i] - buy > profit){
                profit = nums[i] - buy;
            }
        }
        return profit;
    }
    public static void main(String[] args) {
        int[] nums = {1,3,4,1,9};
        System.out.println("Maximum Profit : " + buyAndSell(nums));
    }
}
