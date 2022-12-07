import java.util.Arrays;

/**
 * https://leetcode.cn/problems/reshape-the-matrix/
 */
public class data_structure_7_重塑矩阵 {
    public static void main(String[] args) {
        int[][] mat = {{1, 2}, {3, 4}};
        int r = 4;
        int c = 1;
        int[][] result = matrixReshape(mat, r, c);
        System.out.println("mat=" + Arrays.deepToString(mat));
        System.out.println("r=" + r + " , c=" + c + " , result=" + Arrays.deepToString(result));
    }

    public static int[][] matrixReshape(int[][] mat, int r, int c) {
        //二维数组展开为一维数组，进行数据填充
        // （n,m）==n*m =r*c
        // 单个元素的位置变化可以通过(i,j)可以通过一维数组的 i*n+j来确定位置
        //将一维数组反转成新的二维数组过程中同样可以使用此规则进行
        int m = mat.length; //行
        int n = mat[0].length;//列
        int[][] result = new int[r][c];
        if (m * n != r * c) {
            return mat;
        }
        for (int i = 0; i < m * n; i++) {
            result[i / c][i % c] = mat[i / n][i % n];
        }
        return result;
    }
}
