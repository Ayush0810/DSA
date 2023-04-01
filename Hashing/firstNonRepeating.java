import java.util.HashMap;



public class firstNonRepeating {


    // *brute force approach 
    public static void bruteForce(int arr[]){
        for (int i = 0; i < arr.length; i++) {
            boolean isReapeating =  false;
            for (int j = 0; j < arr.length; j++) {
               if(i!= j && arr[i] == arr[j]){
                isReapeating=true;
                break;
               }
            }
            if(!isReapeating){
                System.out.println(arr[i]);
                break;
            }
        } 
       
    }

        //* optimum approach
    public static void frequncy(int arr[]){
        HashMap <Integer , Integer> sc= new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
           sc.put(arr[i], sc.getOrDefault(arr[i], 0)+1);
        }
        for (int i = 0; i < sc.size(); i++) {
            if(sc.get(arr[i])==1){
                System.out.println(arr[i]);
                break;
            }
        }
    }
  public static void main(String[] args) {
    int arr[] = {1,2,3,1,2,5};
    // bruteForce(arr);
    frequncy(arr);

  }  
}
