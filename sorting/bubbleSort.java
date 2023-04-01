public class bubbleSort{
    // public static void sort(int[]a) {
    //     for (int i = 0; i < a.length-1; i++) {
    //         for (int j = 0; j < a.length-1-i; j++) {
    //             if(a[j]>a[j+1]){
    //           int temp = a[j];
    //            a[j] = a[j+1];
    //            a[j+1] = temp; 
    //             }

    //         }
    //     }
    //     for (int item : a) {
    //         System.out.println(item);
    //     }
        
    // }
    public static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int currElemnt = a[i];
            int prev = i-1;
            //finding correct position
            while(prev>=0 && a[prev]>currElemnt){
               a[prev+1] = a[prev];
               prev--; 
            }
            //insertion
            a[prev+1] = currElemnt;

        }
        for (int item : a) {
            System.out.println(item);
        }
    }
    public static void main(String[] args) {
        int a[] = {5,4,1,3,2};
      insertionSort(a);
  
    }
}