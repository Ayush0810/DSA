import java.util.Stack;

public class pushAtBottom {
    //*1st question  */
    //! solve it using recurrsion first empty the stack then push the given data using push method and call the function again
    public static void bottom(Stack<Integer>s, int data) {
       if(s.isEmpty()){
           s.push(data);
           return;
        }
        int top = s.pop();
        bottom(s, data);
        s.push(top);
    }
    public static void main(String[] args) {
        Stack <Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        bottom(s, 4);
        while(!s.isEmpty()){
            int x = s.peek();
            System.out.println(x);
            s.pop();
        }
    }
}
