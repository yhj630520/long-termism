import java.util.HashMap;
import java.util.Map;

/**
 * https://leetcode.cn/problems/contains-duplicate/?envType=study-plan&id=shu-ju-jie-gou-ru-men&plan=data-structures&plan_progress=11anfis
 */
public class data_structure_1_存在重复元素 {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7};
        System.out.println(containsDuplicate(numbers));
    }

    public static boolean containsDuplicate(int[] nums) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            //判断是否存在，已经存在直接返回true，不存在就存入
            Integer value = countMap.get(nums[i]);
            //存在，直接返回true
            if (value != null) {
                return true;
            } else {
                countMap.put(nums[i], 1);
            }
        }
        return false;
    }
}
