import java.util.HashMap;
import java.util.HashSet;

public class findDistintSubArray {
    public  static void bruteForce(int a[] , int key){

        //*using two pointer with hashset */
        int s = 0;
        int e = key -1;
        HashSet<Integer> hs = new HashSet<>();
        while (e<a.length-1) {
            hs.clear();
            for (int i = s; i <= e; i++) {
                hs.add(a[i]);
            }
            System.out.print(hs.size()+" ");
            s++;
            e++;
        }
    }

    public static void optimumApproach(int a[] , int key){

    }
    public static void main(String[] args) {
        int a[] = {2,4,3,8,3,9,4,9,10};
        int key = 4;
        bruteForce(a, key);
    }
}
