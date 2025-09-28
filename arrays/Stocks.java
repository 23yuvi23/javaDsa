public class Stocks {
     public static int maxProfit(int[] prices){
        int buyprice = Integer.MAX_VALUE ;
        int maxprofit = 0 ;
        
        for(int i =0 ;i<prices.length ; i++){
            int sellingprice = prices[i];
            if(buyprice<sellingprice){  //profit
             int profit = sellingprice-buyprice;  //todays profit
             maxprofit = Math.max(maxprofit, profit);  //global profit
            } else {
                buyprice = prices[i];
            }
        }
        return maxprofit ;
     }
     public static void main(String args[]){
        int prices[] = {7,6,4,3,1};
        System.out.println(maxProfit(prices));
     }
}

//timecomplexity = O(n)