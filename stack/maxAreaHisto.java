import java.util.Stack;

public class maxAreaHisto {
    public static void areaOfRectange(int a[]){
        int maxArea = 0;
        Stack <Integer> s = new Stack<>();
        int sl[] = new int[a.length];
        int sr[] = new int[a.length];
        for (int i = 0; i < a.length; i++) {
            while(!s.isEmpty() && a[s.peek()] >= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                sl[i] = -1;
            }else{
                sl[i] =  s.peek();
            }

            s.push(i);
        }

        s= new Stack<>();
        for (int i = a.length-1; i >=0; i--) {
            while(!s.isEmpty() && a[s.peek()] >= a[i]){
                s.pop();
            }
            if(s.isEmpty()){
                sr[i] =a.length ;
            }else{
                sr[i] = s.peek();
            }

            s.push(i);
        }

        for (int i = 0; i < a.length; i++) {
            int height = a[i];
            int width = sr[i] - sl[i] -1;
            int currentarea = height*width;
            maxArea = Math.max(currentarea, maxArea);
        }

        System.out.println(maxArea);
    }
    public static void main(String[] args) {
        int a[] = {2,1,5,6,2,3};
        areaOfRectange(a);
    }
}
