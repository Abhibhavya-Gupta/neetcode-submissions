class Solution {
    int maxprofit=Integer.MIN_VALUE;
    HashMap<String,Integer> dp;
    public int maxProfit(int[] prices) {
        dp=new HashMap<>();
        return helper(prices,0,false);

    }
    int helper(int[] prices,int i, boolean buying)
    {
        if(i>=prices.length)
        {
            return 0;
        }
        if(dp.containsKey(i+","+buying))
        {
            return dp.get(i+","+buying);
        }
        if(!buying)
        {
           int buy = helper(prices,i+1,true) - prices[i];
            //cooldown
            int cooldown = helper(prices,i+1,buying);
            dp.put(i+","+buying,Math.max(buy,cooldown));
        }
        else
        {
            int sell = helper(prices,i+2,false) + prices[i];

            int cooldown = helper(prices,i+1,buying);

            dp.put(i+","+buying,Math.max(sell,cooldown));
        }
        return dp.get(i+","+buying);
    }
    String toKey(int[] arr)
    {
        return Arrays.toString(arr);
    }
}
