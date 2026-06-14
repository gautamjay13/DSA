

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
            tail.next = temp ;
            tail = temp;
        
        }
        
    }
    
    void insertathead(int val) {
        Node temp = new Node(val);
        if (head == null) head = tail = temp;
        else {
            temp.next = head ;
            head = temp ; 
        }
    }
    void insert(int index , int val){
        if (index==0) {
            insertathead(val);
            return ;
        }
        else{
            System.out.println("invalid index");
        }

        Node temp = new Node(val);
        Node x = head ; 
        for (int i = 1; i < index -1 ; i++) {
          x = x.next ;  
        }
        temp.next = x.next ;
        x.next = temp ; 

    }
    void display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.val+ " ");
            temp = temp.next;
        }
        System.out.println();
    }
}

public class q5_insertatindex {
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertatlast(10);
        list.insertatlast(20);
        list.insertatlast(30);
        list.insertatlast(40);
        list.display();
        list.insertathead(50);
        list.display();
        list.insert(3,100);
        list.display();
        list.insert(6, 100);
        list.display();
    }
}
