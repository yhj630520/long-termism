import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

/**
 * https://leetcode.cn/problems/intersection-of-two-arrays-ii/?envType=study-plan&id=shu-ju-jie-gou-ru-men&plan=data-structures&plan_progress=11anfis
 */
public class data_structure_5_两个数组的交集2 {

    public static void main(String[] args) {

        int[] num1 = {1,2,2,1};
        int[] num2 = {2,2};
        int[] intersect = intersect(num1, num2);
        System.out.println(Arrays.toString(intersect));
    }

    public static int[] intersect(int[] nums1, int[] nums2) {
        //将一个数组转换为map value存储出现的次数值，在做另一个数组的循环，找到对应的，数字存储到结果数组中，同时value--
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums1.length; i++) {
            if (hashMap.containsKey(nums1[i])) {
                Integer integer = hashMap.get(nums1[i]);
                hashMap.put(nums1[i], integer + 1);
            } else {
                hashMap.put(nums1[i], 1);
            }
        }
        ArrayList<Integer> list = new ArrayList<>();

        //循环数组2
        for (int i = 0; i < nums2.length; i++) {
            boolean containsKey = hashMap.containsKey(nums2[i]);
            Integer count = hashMap.get(nums2[i]);
            if (containsKey && count > 0) {
                //包含数组2中的元素
                list.add(nums2[i]);
                Integer value = hashMap.get(nums2[i]);
                hashMap.put(nums2[i], value - 1);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

}
