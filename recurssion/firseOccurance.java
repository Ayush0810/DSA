public class firseOccurance {
    // public static int occurance(int[] arr, int key , int i ) {
    //     if (i==arr.length) return -1;
    //     if(arr[i]==key)return i;
    //     return occurance(arr, key, i+1);
    // }
    public static int lastOccurance(int[] arr, int key , int i ) {
        if (i==1) return -1;
        if(arr[i]==key)return i;
        return lastOccurance(arr, key, i-1);
    }
    public static void main(String[] args) {
        //int arr[] = {2,4,62,5,8,5,93,1};
        //System.out.println(occurance(arr, 1, 0));

        String n1 = "11";
        StringBuilder sb = new StringBuilder("");
        
        String n2 = "121";
        System.out.println(n1+n2);
       // System.out.println(lastOccurance(arr, 5, arr.length-1));
    }   
}
