import java.util.*;
public class shortestPath {

    public static int shortestPath(String str) {
        int x = 0;
        int y  =0;
        for (int i = 0; i < str.length(); i++) {
            if(str.charAt(i)=='N'){
                y += 1;
            }else if (str.charAt(i) =='S'){
                y -=1;
            }else if(str.charAt(i)=='W'){
                x-=1;
            }else{
                x+=1;
            }

        }
       int x2 = x*x;
       int y2 = y*y;
       return (int)Math.sqrt(x2+y2);
    }
    public static void main(String[] args) {
         String str = "WNEENESENNN";
         System.out.println(shortestPath(str));
    }
}
