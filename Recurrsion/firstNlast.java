

public class firstNlast {
    static int lastOccurance(int a[] , int K ,int i){
        if(i==a.length)return -1;
        int isFound = lastOccurance(a, K, i+1);
        if(isFound ==-1 && a[i]==K){
            return i;
        }
        return isFound;
    }
    static int firstOccurance(int a[] , int K, int i ){
        if(i==a.length)return -1;
        if(a[i] == K) return i;
        return firstOccurance(a, K,i+1);
    }
    public static void main(String[] args) {
        int a[] = {9,1,4,2,5,7,2,6,7,1,5};
        System.out.println(firstOccurance(a, 1, 0));
        System.out.println(lastOccurance(a, 1, 0));
    }
}
