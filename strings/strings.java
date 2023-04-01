public class strings {

    public static boolean paindrome(String a) {
        for (int i = 0; i < a.length()/2; i++) {
            if(a.charAt(i) != a.charAt(a.length()-i-1)){
                return false;
            }
        }
      return true;
    }
    public static void main(String[] args) {
        String a = "racagr";
       System.out.println( paindrome(a));
       
    }

}
