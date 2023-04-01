

public class fibonaaci {
    public static int series(int n ) {
       if(n==0||n==1){
        return n;
       }
       int sum = series(n-1)+series(n-2);
       return sum;
       }

  
    public static void main(String[] args) {
        int n =2;
        System.out.println(series(n));
    }
}
