

public class kadaneAlgo {

    public static void alogo(int a []) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a.length==1){
                System.out.println(1);
                return;
            }
            sum += a[i];
            if(sum<0){
                sum = 0;
               
            }else if(sum > 0){
                maxSum = sum ;
            }
        }
        System.out.println(maxSum);
    }
    public static void main(String[] args) {
        int a[] = {5,4,-1,7,8};
        alogo(a);
    }
}
