import java.util.Stack;
//* make under standing of push at bottom question strong  */

//! using two recursive funtions here

//todo   =>>> IMP question 



public class reverseStack {
    public static void newReverse( Stack<Integer> s){
        if(s.isEmpty()){
            return; 
        }
        int top = s.pop();
        newReverse(s);
        bottom(s, top);
        

    }
    public static void bottom( Stack<Integer> s , int data){
        if(s.isEmpty()){
            s.push(data);
            return; 
        }
        int top = s.pop();
        bottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        newReverse(s);
        while(!s.isEmpty()){

            System.out.println(s.peek());
            s.pop();
        }
    }
}
