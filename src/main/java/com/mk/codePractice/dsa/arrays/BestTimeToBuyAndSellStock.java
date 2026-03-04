package com.mk.codePractice.dsa.arrays;

public class BestTimeToBuyAndSellStock {

    public int maxProfit(int[] prices) {

        int maxProfit = 0;

        int length = prices.length;
        for (int i =1; i < length; i++) {
            int dayTrading = prices[i] - prices[i-1];

            maxProfit += Math.max(0, dayTrading);

        }

        return maxProfit;

    }

}
