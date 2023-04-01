import java.util.HashMap;
import java.util.HashSet;

// package Hashi/ng;

public class sumEqualsK {

    public static boolean bruteForce(int a[] , int S){

        // * brute force approach   =>  TIME COMPLEXITY = o(n2);
        for (int i = 0; i < a.length-2; i++) {
            for (int j = i+1; j < a.length-1; j++) {    
                    if(a[i] + a[j] ==S){
                        return true;         
                }
            }
        }
        return false;
    }


    //* two pointer approach   */

    public static void twoPointer(int a[] , int S){
        for (int i = 0; i < a.length; i++) {
            for (int j = i; j < a.length-1; j++) {
               if(a[j]>a[j+1]){
                int temp = a[j];
                a[j] = a[j+1];
                a[j+1] = temp;
               } 
            }
        }

        //*---> this code is almost same for 2 pointer */

        int s= 0;
        int e = a.length - 1;
        while(s<e){
            if(a[s]+a[e] == S){
               System.out.println(a[s]  + " " +a[e]);
            s++ ;
            e--;
            }else if(a[s]+a[e] >S){
                e--;
            }else{
                s++;
            }

        }
    }

    //* -> third approach using Hashmap */
    public static void usingHash(int a[] , int S){
        HashMap<Integer, Integer> sc = new HashMap<>();
        for (int i = 0; i < a.length; i++) {
            sc.put(a[i] , 0 );

        }
        for (int i = 0; i < a.length; i++) {
            int x  = a[i];
            int y = S-x;
            if(x!=y && sc.containsKey(y)){
                System.out.println(x + " "+ y);
            }
        }


    }

    public static void usingHashSet(int a[] , int S){
        HashSet <Integer> hs  = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            int x = a[i];
            int y = S-x;
            if(hs.contains(y)){
                System.out.println(x  + " " +y);
            }else{
                hs.add(x);
            }
        }
    }

    public static void main(String[] args) {
        int a[] = {8,1,2,4,5,10,0,6,7};
    //    System.out.println( bruteForce(a, 400));
    //    twoPointer(a, 10);
        // usingHash(a, 10);
        usingHashSet(a, 10);
    }
}
