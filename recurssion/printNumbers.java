public class printNumbers {
    public static void name(int x) {
        if(x == 1){
           System.out.println(1);
           return;
        }
        System.out.println(x+" ");
        name(x-1);
    }
    public static void main(String[] args) {
        int x = 10;
        name(x);

    }
}
