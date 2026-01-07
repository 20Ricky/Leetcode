class Solution {
    public int maxProfit(int[] prices) {
        int maxp=0,p=0;
        int mincost=prices[0];
        for(int i=1;i<prices.length;i++){
            p=prices[i]-mincost;
            maxp=Math.max(p,maxp);
            if(prices[i]<mincost) mincost=prices[i];
        }
            return maxp;
    }
}