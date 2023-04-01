import java.util.Stack;

                //! IMPORTANT QUESTION BECAUSE OF LOGIC !//
public class nextGreater {
    public static void nextSmallerRight(int a[] , int ng[]){
        Stack<Integer> s = new Stack<>();
       for (int i = a.length-1; i >=0; i--) {
        while(!s.isEmpty() && a[s.peek()]>= a[i]){
            s.pop();
        }

        if(s.isEmpty()){
            ng[i] = -1;
        }else{
            ng[i] = a[s.peek()];
        }

        s.push(i);
       }
    }
    public static void nextSmallerLeft(int a[] , int ng[]){
        Stack<Integer> s = new Stack<>();
       for (int i = 0; i < a.length; i++) {
        while(!s.isEmpty() && a[s.peek()]>= a[i]){
            s.pop();
        }

        if(s.isEmpty()){
            ng[i] = -1;
        }else{
            ng[i] = a[s.peek()];
        }

        s.push(i);
       }
    }
    public static void nextGreaterLeft(int a[] , int ng[]){
        Stack<Integer> s = new Stack<>();
        for (int i = 0; i < a.length; i++) {
            while(!s.isEmpty() && a[s.peek()]<=a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                ng[i] = -1;
            }else{
                ng[i] = a[s.peek()];
            }
            s.push(i);
        }
    }
    public static void nextGreaterRight(int a[], int ng[]) {
        Stack <Integer> s = new Stack<>();
        for (int i = a.length-1; i >=0; i--) {
            while(!s.isEmpty() && a[s.peek()] <= a[i]){
                s.pop();
            }

            if(s.isEmpty()){
                ng[i] = -1;
            }else{
                ng[i] = a[s.peek()];
            }

            s.push(i);
        }
    }
    public static void main(String[] args) {
            int a [] = {6,8,0,1,3};
            int ng[] = new int[a.length];
            // nextGreaterRight(a, ng);
            // nextGreaterLeft(a, ng);
            // nextSmallerLeft(a, ng);
            nextSmallerRight(a, ng);
            for (int i : ng) {
                System.out.println(i);
            }

    }
}
