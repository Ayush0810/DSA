

public class factorial {
    static int fac(int n){
        if(n==1){
          
            return 1;
        }
      int abc= n * fac(n-1);
      return abc;
    }
    public static void main(String[] args) {
        System.out.println(fac(5));
    }
}
