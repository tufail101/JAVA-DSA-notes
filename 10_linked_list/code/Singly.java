
class Node {

    int data;
    Node next;

    Node(int data) {
        this.data = data;
        this.next = null;
    }

}

public class Singly {

  /*  // public static void normal() {
    // Node newnode = new Node(10); //node created

    // Node Head;
    // Head = newnode;

    // Node node1 = new Node(20);
    // newnode.next = node1;

    // Node temp;
    // temp = Head;

    // while (temp != null) {
    // System.out.println(temp.data);
    // temp = temp.next;
    // }
    // }

    */
    
    static Node head;

    static void insertAtBeging(int data) {
        Node newNode = new Node(data);
        newNode.next = head;
        head = newNode;
    }

    static void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        temp.next = newNode;
    }

    static void deleteFromBeging() {
        if (head == null)
            return;
        Node temp;
        temp = head;
        head = head.next;
        System.out.println("Deleted: " + temp.data);
    }

    static void deleteFromEnd() {
        if (head == null) {
            System.out.println("List is Empty");
        }
        if (head.next == null) {
            head = null;
            return;
        }
        Node temp = head;
        while (temp.next.next != null) {
            temp = temp.next;
        }
        temp.next = null;

    }

    static void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    static void insertAtSpecificPosition(int data, int pos){
        Node newNode = new Node(data);
        if (pos == 1) {
            newNode.next = head;
            head = newNode;
            return ;
        }
        Node temp = head;
        for(int i = 1; i < pos - 1; i++){
            if(temp == null){
                System.err.println("Invalid Position");
                return ;
            }
            temp = temp.next;
        }

        if (temp == null) {
            System.out.println("Invalid Position");
            return ;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    
    static void deleteSpecificElem(int key){
        if (head == null) {
            System.out.println("List is Empty");
        }
        if (head.data == key) {
            head = head.next;
            return ;
        }
        Node temp = head;
        while (temp.next != null && temp.next.data != key) {
            temp = temp.next;
        }
        if (temp.next == null) {
            System.out.println("Element not found");
        }
        temp.next = temp.next.next;
    }
    public static void main(String args[]) {
        insertAtBeging(10);
        insertAtEnd(20);
        insertAtEnd(30);
        insertAtEnd(40);

        display();
        // deleteFromBeging();
        // deleteFromEnd();
        insertAtSpecificPosition(50,3);
        deleteSpecificElem(50);

        display();

    }
}
