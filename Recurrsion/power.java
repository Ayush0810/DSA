

public class power {
    static double pows(double x, int n ){
        if (n == 0) {
            return 1.0;
        }
        double half = pows(x, n/2);
        if (n % 2 == 0) {
            return half * half;
        }else if (n > 0) {
            return half * half * x;
        } else {
            return half * half * (1/x);
            }
    }
    public static void main(String[] args) {
        System.out.println(pows(2, -2));
    }
}
