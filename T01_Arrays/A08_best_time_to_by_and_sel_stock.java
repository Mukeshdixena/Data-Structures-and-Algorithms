package T01_Arrays;

public class A08_best_time_to_by_and_sel_stock {

    public int maxProfit(int[] prices) {

        int bestSel[] = new int[prices.length];
        bestSel[prices.length - 1] = prices[prices.length - 1];
        for (int i = prices.length - 2; i >= 0; i--) {
            bestSel[i] = Math.max(bestSel[i + 1], prices[i]);
        }

        int max = 0;

        for (int i = 0; i < prices.length; i++) {
            int currProfit = bestSel[i] - prices[i];
            max = Math.max(currProfit, max);
        }

        return max;
    }

    public int maxProfit2(int[] prices) {
        int min = prices[0];
        int cp = 0;
        int mp = 0;
        for (int i = 0; i < prices.length; i++) {
            if (min > prices[i]) {
                min = prices[i];
            }
            cp = prices[i] - min;
            mp = Math.max(cp, mp);
        }
        return mp;
    }
}
