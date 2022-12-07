/**
 * https://leetcode.cn/problems/best-time-to-buy-and-sell-stock/?envType=study-plan&id=shu-ju-jie-gou-ru-men&plan=data-structures&plan_progress=11anfis
 */
public class data_structure_6_买卖股票的最佳时机 {

    public static void main(String[] args) {
        int[] num1 = {5, 3, 6, 5};
        System.out.println(maxProfit(num1));
    }

    public static int maxProfit(int prices[]) {
        //先给最小值赋予一个最大的值，保证能做替换
        int minPrice = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            } else if (prices[i] - minPrice > maxProfit) {
                maxProfit = prices[i] - minPrice;
            }
        }
        return maxProfit;
    }

}
