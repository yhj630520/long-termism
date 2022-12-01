import java.util.Arrays;

/**
 * https://leetcode.cn/problems/merge-sorted-array/?envType=study-plan&id=shu-ju-jie-gou-ru-men&plan=data-structures&plan_progress=11anfis
 */
public class data_structure_4_合并两个有序数组 {
    public static void main(String[] args) {
        int[] num1 = {1, 2, 13, 0, 0, 0};
        int[] num2 = {2, 5, 6};
        System.out.println("num1=" + Arrays.toString(num1));
        merge(num1, 3, num2, 3);
        System.out.println("num1合并后=" + Arrays.toString(num1));
    }

    public static void merge(int[] nums1, int m, int[] nums2, int n) {
        //思路:将nums1中的前m个数组拷贝到临时数组中，在和num2数组的数据进行逐个比较。最后不全剩余数组中的数据
        int indexM = 0, indexN = 0, size = 0;
        int[] tempArr = Arrays.copyOf(nums1, m);

        for (int i = 0; i < m + n; i++) {
            //两个数组 tempArr 和 nums2逐个比较大小
            if (indexM < tempArr.length && indexN < nums2.length && tempArr[indexM] < nums2[indexN]) {
                nums1[i] = tempArr[indexM];
                indexM++;
                size++;
            } else if (indexM < tempArr.length && indexN < nums2.length) {
                nums1[i] = nums2[indexN];
                indexN++;
                size++;
            }
        }
        //添加剩余元素到数组末尾中
        if (indexM < tempArr.length) {
            for (int p = indexM; p < tempArr.length; p++) {
                nums1[size] = tempArr[p];
                size++;
            }
        }
        if (indexN < nums2.length) {
            for (int q = indexN; q < nums2.length; q++) {
                nums1[size] = nums2[q];
                size++;
            }
        }
    }
}
