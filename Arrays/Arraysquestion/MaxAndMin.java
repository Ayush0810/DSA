

public class MaxAndMin {

    public static void massx(int a[]) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < a.length-1; i++) {
            if(min>a[i]){
                min = a[i];
            }else{
                max= a[i];
            }
        }
   System.out.println(min +"is the minimum");
   System.out.println(max +"is the maximum");

    }
  public static void main(String[] args) {
    int a[] = {1,3,2,4,6,7,3};
   massx(a);
    
  }
}
