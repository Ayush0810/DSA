package onClass;
public class buyingstocks {

    public static int stockes(int prices[]) {
        int lowest = Integer.MAX_VALUE;
        int Mprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if(lowest<prices[i]){
               int profit = prices[i] -lowest ;
                    Mprofit =Math.max(Mprofit, profit);
            }else{
                lowest = prices[i];
            }
          
        }
        return Mprofit;
    }
    public static void main(String[] args) {
         int prices[] = {7,1,5,3,6,4}; 
System.out.println(stockes(prices));
    }
}
