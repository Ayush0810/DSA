
public class isSorted {
    public static boolean isOf(int[] a, int i){
        if(i==a.length-1)return true;
        if(a[i]>a[i+1])return false;
        return isOf(a, i+1);
    }
    public static void main(String[] args) {
        int a[] = {1,2,9,4,5,6};
        System.out.println(isOf(a, 0));
    }
}
