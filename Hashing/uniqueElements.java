// package Hashing;

import java.util.HashSet;

public class uniqueElements {

    public static void unique(int a[]){
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < a.length; i++) {
            hs.add(a[i]);
        }
        System.out.println(hs.size());
    }
    public static void main(String[] args) {
        int a[] = {6,6,1,3,4,4,3};
        unique(a);
    }
}
