
class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

public class linkedlist {
    // * creating Linked List
    static Node createLL(int N) {
        Node tail = new Node(1);
        Node head = tail;
        for (int i = 2; i <= N; i++) {
            tail.next = new Node(i);
            tail = tail.next;
        }
        return head;

    }

    // * Printing LinkedList */
    static Node printLL(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println();

        return head;
    }

    // * finding length of linked List */
    static int lengthLL(Node head) {
        Node temp = head;
        int count = 0;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    // * Inserting at the head of linkedList

    static Node insertAtHead(Node head, int data) {
        Node n = new Node(data);
        n.next = head;
        return n;
    }

    // * Inserting at any position in Linked List

    static Node insertAtPos(Node head, int data, int pos) {
        if (pos == 0) {
            return insertAtHead(head, data);
        }
        if (pos > lengthLL(head)) {
            return head;
        }
        Node temp = head;
        for (int i = 1; i < pos; i++) {
            temp = temp.next;
        }
        Node n = new Node(data);
        n.next = temp.next;
        temp.next = n;
        return head;
    }

    // todo => remove head , remove at pos ,
    public static void main(String[] args) {
        Node linkedList = createLL(5);
        printLL(linkedList);
        System.out.print("Length of Linked List is : " +lengthLL(linkedList));


        
        linkedList = insertAtHead(linkedList, 20); 
        System.out.println("new head");
        printLL(linkedList);


        System.out.println("inserting in middle");
        linkedList = insertAtPos(linkedList, 30, 3);
        printLL(linkedList);

    }
}