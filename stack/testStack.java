

public class testStack {
   public static void main(String[] args) {

    // *creating stack using Linked List 
    // usingLL ll = new usingLL();
    // ll.push(3);
    // ll.push(4);
    // ll.push(5);
    // ll.pop();
    // ll.push(6);
    // while(!ll.isEmpty()){
    //     int x = ll.top();
    //     System.out.println(x);
    //     ll.pop();
    // }

    //*creating stack using arrayList */
    usingArrlist arrl = new usingArrlist();
    arrl.push(1);
    arrl.push(4);
    arrl.push(10);
    if(!arrl.isEmpty()){
        System.out.println(arrl.top());
        arrl.pop();
    }

    //*creating stack using array */
   }
}
