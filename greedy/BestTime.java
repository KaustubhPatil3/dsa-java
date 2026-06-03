class BestTime {
    public int maxProfit(int[] prices)
    {
        if (prices == null || prices.length < 2)
        {
            return 0;
        }
        
        int minPrice = prices[0];
        int maxProfit = 0;

        for (int i = 1; i < prices.length; i++) 
        {
            int profit = prices[i] - minPrice;
            maxProfit = Math.max(maxProfit, profit);
            minPrice = Math.min(minPrice, prices[i]);
        }
        return maxProfit;
    }
    
    public static void main(String[] args) 
    {
        BestTime obj = new BestTime();
        
        int[] prices1 = {7, 6, 4, 3, 1};
        System.out.println(obj.maxProfit(prices1));
        
        int[] prices2 = {7, 1, 5, 3, 6, 4};
        System.out.println(obj.maxProfit(prices2));
    }
}