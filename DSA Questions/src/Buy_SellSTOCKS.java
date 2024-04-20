//PYQ
public class Buy_SellSTOCKS {
    public static int Stocks(int prices[]){
        int bp = Integer.MAX_VALUE;//Buying Price = + ve infinity
        int MaxProfit = 0;

        for(int i=0; i<prices.length;i++){
            if(bp < prices[i]){//Profit
                int profit = prices[i] - bp;// Today's Profit
                MaxProfit = Math.max(MaxProfit, profit); // All time max profit, max of two
            }else{
                bp = prices[i];
            }
        }
        return MaxProfit;
    }
    public static void main(String arg[]){
        int prices[] = {7,1,5,3,16,4};
        System.out.println(Stocks(prices));
        //Time Complexity = O(n)
        
    }
}
