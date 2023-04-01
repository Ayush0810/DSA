// package Hashing;

import java.security.Key;
import java.util.HashMap;

import javax.swing.text.html.FormView;

public class itenaryTickets {
    public static String getStart( HashMap<String, String> hm){
        HashMap <String , String> revhm = new HashMap<>();

        for (String tickets : hm.keySet()) {
           revhm.put(hm.get(tickets),tickets);
        }

       for (String tickets : hm.keySet()) {
           if(!revhm.containsKey(tickets)){
               return tickets;
           }
       }
       return null;
       
   }
    
    public static void main(String[] args) {
        HashMap<String, String> hm = new HashMap<>();
         hm.put("chennai" , "bangalore");
         hm.put("mumbai" , "delhi");
         hm.put("goa" , "chennai");
         hm.put("delhi" , "goa");

         String start = getStart(hm);
         System.out.print(start);
         for (String tickets : hm.keySet()) {
            System.out.print("->" + hm.get(start));
            start = hm.get(start);        
         }
         System.out.println();
    }
    
}
