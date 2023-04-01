package onClass;
public class subarray {
    //1st method


    // public static void main(String[] args) {
    //     int a[] ={2,4,6,8,10};
    //  subaray(a);
        
    // }

    // public static void subaray(int a[]) {
    //     for(int i =0; i<a.length; i++){
    //         int start = i;
    //         for (int j = i; j < a.length; j++) {
    //             int end = j;
    //             for (int k = start; k <=end; k++) {
    //                 System.out.print(a[k]+" ");
    //             }
    //             System.out.println();
    //         }
    //         System.out.println();
    //     }
    // }


   //KADANE'S ALGO
    public static void main(String[] args) {
        int a[] ={-2,-3,4,-1,-2,1,5,-3};
        sumArray(a);
    }
    public static void sumArray(int a[]) {
            int sum = 0;
            int maxSum = Integer.MIN_VALUE;
            for (int i = 0; i < a.length-1; i++) {
                sum += a[i];
                if(sum<0){
                    sum = 0;
                }
                if(sum >0){
                    maxSum = sum ;
                }
            }
            System.out.println(maxSum);
    }
}
