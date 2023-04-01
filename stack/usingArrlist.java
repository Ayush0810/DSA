

import java.util.ArrayList;

public class usingArrlist {

    ArrayList <Integer> al; 
    usingArrlist(){
        al = new ArrayList<>();    
    }

    void push(int data){
        if(al == null){
            System.out.println("first insert an element in stack");
        }
        al.add(data);
    }

    int pop(){
        int n = al.size();
      return  al.remove(n-1);
    }

    int top(){
        return al.get(al.size()-1);
    }
    boolean isEmpty(){
        return al.size() == 0;
    }
    
}
