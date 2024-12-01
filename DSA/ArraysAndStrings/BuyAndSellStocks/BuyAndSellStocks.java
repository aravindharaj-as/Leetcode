package DSA.ArraysAndStrings.BuyAndSellStocks;

import DSA.util.Input.GetInput;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] prices = GetInput.getIntArray();

        System.out.println("Max Profit: " + maxProfit(prices));
    }

    public static int maxProfit (int[] prices) {
        int buyPointer = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) {
            if (prices[i] < buyPointer) {
                buyPointer = prices[i];
            }

            maxProfit = Math.max(maxProfit, prices[i] - buyPointer);
        }

        return maxProfit;
    }
}
