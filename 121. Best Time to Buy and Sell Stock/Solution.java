class Solution {
  public static int maxProfit(int[] prices) {
    int maxProfit = 0;
    int max = prices[0];
    int min = prices[0];
    for (int i = 0; i < prices.length; i++) {
      if (prices[i] < min) {
        min = prices[i];
        max = prices[i];
      }
      if (prices[i] > max) {
        max = prices[i];
      }
      if (max - min > maxProfit) {
        maxProfit = max - min;
      }
    }
    return maxProfit;
  }

  
}