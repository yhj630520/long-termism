/**
 * https://leetcode.cn/problems/maximum-subarray/?envType=study-plan&id=shu-ju-jie-gou-ru-men&plan=data-structures&plan_progress=11anfis
 */
public class data_structure_2_最大子数组和 {
    public static void main(String[] args) {
        //int[] numbers = {1, 2, 3, 4, -5, 1, 2};
        int[] numbers = {1, 2, 3, 4, -2, 1, 2};
        System.out.println(maxSubArray(numbers));
    }

    public static int maxSubArray(int[] nums) {
        int max = nums[0];
        //子数组总和
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (sum > 0) {
                sum += nums[i];
            } else {
                sum = nums[i];
            }
            max = Math.max(max, sum);
        }
        return max;
    }
}
