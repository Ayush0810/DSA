
public class fibonacci {
    static int number(int n){
        if(n==0||n==1){
            return n;
        }
        // System.out.print(n + " ");
      return  number(n-1)+number(n-2);
     
    }
    public static void main(String[] args) {
        int n =10;
        for (int i = 0; i < n; i++) {
            System.out.print(number(i) +" ");
            
        }
    }
}
