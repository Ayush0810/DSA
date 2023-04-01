import java.util.*;

public class primeOrNot {
     static void primeOrWat(int x) {
        if(x%2==0){
            System.out.println("number is prime");
        }else{
            System.out.println("not a prime number");
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a number");
        int x = sc.nextInt();
        primeOrWat(x);
    }
}
