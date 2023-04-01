package onClass;
public class reverse {

    public static void main(String[] args) {
        int a[] = { 2, 4, 6, 12, 5, 8, 10 };
        // Logic = use loop to loop only half of array =>a.lenth/2
        for (int i = 0; i < a.length / 2; i++) {
            // and use length-1-i to swap to first element that is i
            int temp = a[a.length - 1 - i];
            a[a.length - 1 - i] = a[i];
            a[i] = temp;
        }

        for (int item : a) {
            System.out.println(item);
        }
    }
}
