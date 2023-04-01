

public class reverseArray {
    public static void revrse(int a []) {
        int n = a.length;
        for (int i = 0; i <n/2; i++) {
            int temp = a[n-1-i];
             a[n-i-1] = a[i];
             a[i] = temp; 
        }
        for (int item : a) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        int a[] = {1,2,3,5,4,6,7};
        revrse(a);
    }
}
