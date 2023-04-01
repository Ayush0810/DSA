
public class ifSorted {
    static boolean sorted(int a[],int i){
    
        if(i == a.length)return true;
        if(a[i] >a[i+1]){
            return false;
        }
        return sorted(a, i+1);
    }
    public static void main(String[] args) {
        int a[] = {1,2,4,3,5};
     
        System.out.println(sorted(a,0));
    }
}
