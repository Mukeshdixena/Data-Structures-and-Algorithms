package T01_Arrays;

public class A08_best_time_to_sell_stock {
    public int maxProfit(int[] prices) {
        int min = prices[0];
        int ans = 0;

        for(int i = 0; i < prices.length; i++){
            min = Math.min(min, prices[i]);
            ans = Math.max(prices[i] - min, ans);
        }
        return ans;
    }
}
