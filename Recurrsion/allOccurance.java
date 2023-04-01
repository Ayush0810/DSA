
public class allOccurance {
    public static int all(int a[] , int k , int i){
        if(i == a.length) {
            return -1;
        }
        int isFound = all(a, k, i+1);
        return isFound;

    }
    public static void main(String[] args) {
        int a[] = {3,2,4,5,6,2,7,2,2};
        int k = 2;
        System.out.println(all(a, k, 0));
    }
}
