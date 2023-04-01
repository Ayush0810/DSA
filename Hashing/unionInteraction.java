

import java.util.HashSet;

public class unionInteraction {
    public static void intersection(int a[] , int b[] , HashSet <Integer> sc ){
        sc.clear();
        for (int i = 0; i < a.length; i++) {
            sc.add(a[i]);
        }
            int count =0;
        for (int i = 0; i < b.length; i++) {
            if(sc.contains(b[i])){
                    count++;
                    sc.remove(b[i]);
            }
        }
        System.out.println(count);
    }



    public static void union(int a[] , int b[], HashSet <Integer> sc){
           for (int i = 0; i < a.length; i++) {
                sc.add(a[i]);
           }
           for (int i = 0; i < b.length; i++) {
                sc.add(b[i]);
           }

           System.out.println(sc.size());
    }
    public static void main(String[] args) {
        int a[] = {7,3,9};
        int b[] = {6,3,9,2,9,4};
        HashSet <Integer> sc = new HashSet<>();

        union(a, b, sc);
        intersection(a, b, sc);
    }
}
