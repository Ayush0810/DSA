public class reverseString {

    public static void reverse(String str) {
      StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= str.length(); i++) {
         sb.append(str.charAt(str.length()-i));
        }
        
        System.out.println(sb.toString());
    }
    public static void main(String[] args) {
        String str = "ayush singh";
        reverse(str);
    }
}
