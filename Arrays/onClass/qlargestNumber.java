package onClass;
import java.util.*;

public class qlargestNumber {
  
    public static void main(String[] args) {
        int a[] = {2,5,10,9,11,2,3};
        int b = Integer.MIN_VALUE;
        int c = Integer.MAX_VALUE;
        for (int i = 0; i < a.length; i++) {
            if(a[i]>b){
                b=a[i];
            }else if(a[i]<c){
                c= a[i];
            }
        }
        System.out.println(b);
        System.out.println(c);
    }
}
