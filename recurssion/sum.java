public class sum {
    // static int Nsum(int N ){
    //         if(N==0)return 0;
    //     return Nsum(N-1)+N;
          
    // }

    static int power(int a[]){
        for (int i = 0; i < a.length; i++) {
          int sum = 0;
          sum += a[i];
          int maxSum = Integer.MIN_VALUE ;
          if(sum < 0){
            sum = 0;
          }else{
            maxSum = sum;
          }
        }
        return maxSum;
    }
  public static void main(String[] args) {
       int a[] = {1,2,3,-2,5};       // System.out.println(Nsum(5));
      //  System.out.println(power(a, b));
  }  
}
