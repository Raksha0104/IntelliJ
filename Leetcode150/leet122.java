package Leetcode150;

public class leet122 {
    public static void main(String[] args) {
        int[] prices = {7,1,5,3,6,4};
        int k = maxProfit(prices);
        System.out.println(k);
    }

    public static int maxProfit(int[] prices) {
        int oldPrices = prices[0];
        int profit = 0;
        for(int i=1;i<prices.length;i++){
            if(prices[i]<oldPrices){
                oldPrices = prices[i];
            }
            else{
                profit +=prices[i]-oldPrices;
                oldPrices = prices[i];
            }
        }
        return profit;
    }
}
