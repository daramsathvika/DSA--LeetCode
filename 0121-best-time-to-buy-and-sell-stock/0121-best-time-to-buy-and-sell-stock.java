class Solution {
    public int maxProfit(int[] prices) {
        int i=0,n=prices.length,profit=0,min=prices[0];
        for(i=0;i<n;i++){
            if(prices[i]<min){min=prices[i];}
            if(prices[i]-min>profit){profit=prices[i]-min;}
        }
        return profit;
    }
}