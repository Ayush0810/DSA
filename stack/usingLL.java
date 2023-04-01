
class Node{
    int data;
    Node next;
    Node(int d){
        data= d;
        next = null;
    }
}
public class usingLL {
        Node head;
        usingLL(){
            head = null;
        }
      void push(int d){
       if(head == null){
           head = new Node(d);
       }else{
        Node n = new Node(d);
        n.next = head;
        head = n;
       }
    }

     void pop(){
        if(head != null){
            head = head.next;
        }
    }
     int top(){
      return head.data;
    }

    boolean isEmpty(){
        return head ==null;
    }

}
