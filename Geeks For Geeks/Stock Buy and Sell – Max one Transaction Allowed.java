class Solution {
    public int maximumProfit(int prices[]) {
        int minPrice = Integer.MAX_VALUE; // Minimum price encountered so far
        int maxProfit = 0;                // Maximum profit calculated

        for (int price : prices) {
            // Update the minimum price if the current price is smaller
            if (price < minPrice) {
                minPrice = price;
            } 
            // Calculate the profit and update maxProfit if it's higher
            else {
                maxProfit = Math.max(maxProfit, price - minPrice);
            }
        }

        return maxProfit;
    }
}
