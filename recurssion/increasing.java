


public class increasing {
    public static void increase(int x){
        
        if(x == 1) {
            System.out.println(1);
            return;
        }
        increase(x-1);
        System.out.println(x);
     
    }
    public static void main(String[] args) {
        int x = 5;
       increase(x);
    }

}
