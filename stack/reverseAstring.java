import java.util.*;

public class reverseAstring {
     static void reversse(String str) {
        Stack<Character> s = new Stack<>();
        int x = 0;
        while(x<str.length()){
            s.push(str.charAt(x));
            x++;
        }
        StringBuilder sc = new StringBuilder();
        while(!s.isEmpty()){
          char ch = s.pop();
            sc.append(ch);
        }
      System.out.println(sc.toString());
    }
    public static void main(String[] args) {
        String str  ="abc";
        reversse(str);
    }
}
