package onClass;
public class largestSumSubarray {
    public static void largestSumSubarra(int a[]) {
        int sum = 0;
        int arraysum = Integer.MIN_VALUE;
        for (int i = 0; i < a.length; i++) {
          
            for (int j = i; j < a.length; j++) {
                sum = 0;
                for (int k = i; k <= j; k++) {
                  sum += a[k] ;    
                }
                System.out.println(sum);
                if(arraysum < sum){
                    arraysum = sum;
                   
                  }

            }
        
        }
        System.out.println("largest sum "+arraysum);
    }
    public static void main(String[] args) {
        // int a[] = {1,-2,6,-1,3};
        int a[] = {2,4,6,8,10};
       largestSumSubarra(a);
    }
}
