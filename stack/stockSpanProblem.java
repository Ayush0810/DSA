import java.util.Stack;

public class stockSpanProblem {

    public static void stockSpan(int stock[] , int span[]){
        Stack<Integer> s = new Stack<>();//creating a stack for storing the previous high number than the current number */
        span[0] = 1; //  creating span[0] = 1; => int span [] = {0}
        s.push(0); //  stack mei pushed 0;
        for (int i = 1; i < stock.length; i++) { //  for loop in stock so to find the       current price and previous high price
          int currItem = stock[i];  
          while(!s.isEmpty() && currItem>stock[s.peek()]){
            s.pop();
          }
          if(s.isEmpty()){
            span[i] = i+1;
          }else{
            int prevHigh =s.peek();
            span[i] = i - prevHigh;
          }

          s.push(i);
        }
    }

   public static void main(String[] args) {
        int stock[] = {100,80,60,70,60,85,100};
        int span [] = new int[stock.length];
        stockSpan(stock, span);
        for (int i : span) {
            System.out.println(i);
        }
   } 
}
