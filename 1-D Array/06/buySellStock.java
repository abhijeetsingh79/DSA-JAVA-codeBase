public class buySellStock {
    public static void main(String[] args) {
        // brute force :- O(n^2)
        // int i=0;
        // int profit = 0;
        // while(i<prices.length-1){
        //     int j=i+1;
        //     int sellValue =0;
        //     while(j<prices.length){
        //         if(prices[j]>sellValue){
        //             sellValue = prices[j];
        //         }
        //         int gotProfit = sellValue-prices[i];
        //         if(gotProfit>profit){
        //             profit = gotProfit;
        //         }
        //         j++;
        //     }
        //     i++;
        // }
        // return profit;


        // Optimal Approach O(n)
        // int buyValue = Integer.MAX_VALUE; //
        // int profit =0;
        // for(int i=0; i<prices.length; i++){
        //     if(prices[i]<buyValue){  /* buying price kam se kam hoga and har din agar sell karenge to profit find amx profit get */ 
        //         buyValue = prices[i];
        //     }

        //     int p1 = prices[i]-buyValue;
        //     if(p1>profit){
        //         profit = p1;
        //     }
        // }
        
        // return profit;

    }
}
