

public class printNnatural {
    static void increasing(int n ){
        if(n==1){
            System.out.print(1 + " ");
            return;
        }
        increasing(n-1);
        System.out.print(n +" ");
    }
    static void decreasing(int n ){
        if (n==1) {
            System.out.println(n);;
            return ;
        } 
        System.out.print(n +" ");
        decreasing(n-1);
    }
    public static void main(String[] args) {
        decreasing(5);
        increasing(5);
    }
}
