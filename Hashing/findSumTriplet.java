import java.util.*;

public class findSumTriplet {
    
    // *brute force method
    public static boolean bruteForce(int a[] , int key){

        // * brute force approach   =>  TIME COMPLEXITY = o(n2);
        for (int i = 0; i < a.length-2; i++) {
            for (int j = i+1; j < a.length-1; j++) {
                for (int k = j+1; k < a.length; k++) {
                    if(a[i] + a[j]+ a[k] ==key){
                        return true;
                    }
                }
            }
        }
        return false;
    }

    // *using two pointer
    public static void twoPointer(int a[] , int key) {
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            int s = i+1;
            int e = a.length-1;
            while (s<e) {
                if(a[i] + a[s] + a[e] == key) {
                    System.out.println(a[i] +" " +a[s] + " " + a[e]);
                    s++;
                    e--;
                }else if(a[i]+a[s] + a[e] > key){
                    e--;
                }else{
                    s++;
                }
            }

        }
    }

    //* using hashset */
    public static void usingHashSet(int a[] , int key) {
        Arrays.sort(a);
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length-3; i++) {
            int x= a[i];
            for (int j = 0; j < a.length; j++) {
                int y = a[j];
                if(hs.contains(key -x-y)){
                    System.out.println(y + " " + x+ " " + a[key - a[i] -a[j]]);
                }else{
                    hs.add(key - a[i] -a[j]);
                }
            }
            hs.clear();
        }
    }

    public static void main(String[] args) {
        int a[] = {1,2,13,5,2,4,21};
        int key = 8;
        // System.out.println(bruteForce(a, key));
        // twoPointer(a, key);
        // usingHashSet(a, key);
    }
    }
