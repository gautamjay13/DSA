

class Node {
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}
class SLL {
    Node head;
    Node tail;
    void insertatlast(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            tail.next = temp;
            tail = temp;
        }
    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.val);
            temp = temp.next;
        }
    }
}

public class q3_insertAtEnd {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertatlast(10);
        list.insertatlast(20);
        list.insertatlast(30);
        list.insertatlast(40);
        list.display();
    }
}
