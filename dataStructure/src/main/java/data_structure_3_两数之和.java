import java.util.Arrays;
import java.util.HashMap;

/**
 * https://leetcode.cn/problems/two-sum/?envType=study-plan&id=shu-ju-jie-gou-ru-men&plan=data-structures&plan_progress=11anfis
 */
public class data_structure_3_两数之和 {

    public static void main(String[] args) {
        int[] nums = {3, 2, 4};
        int[] twoSum = twoSum(nums, 6);
        System.out.println(Arrays.toString(twoSum));
    }

    public static int[] twoSum(int[] nums, int target) {

        Integer other;
        int[] result = {0, 0};
        //思路一：数组转化为map 值作为key 下标为value
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], i);
        }
        //查找：
        for (int i = 0; i < nums.length; i++) {
            other = target - nums[i];
            Integer otherIndex = map.get(other);
            if (otherIndex != null && otherIndex != i) {
                //存在数据
                result[0] = i;
                result[1] = otherIndex;
                return result;
            } else {
                continue;
            }
        }
        return result;
    }
}
