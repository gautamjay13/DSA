 class Node {
    int val;
    Node next;

    Node(int val) {
        this.val = val;
    }
}

class SLL {
    Node head;
    Node tail;
    int size = 0;

    void insertatlast(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            tail.next = temp;
            tail = temp;
        }

        size++;
    }

    void insertathead(int val) {
        Node temp = new Node(val);

        if (head == null) {
            head = tail = temp;
        } else {
            temp.next = head;
            head = temp;
        }

        size++;
    }

    void insert(int index, int val) {

        if (index < 0 || index > size) {
            System.out.println("Invalid Index");
            return;
        }

        if (index == 0) {
            insertathead(val);
            return;
        }

        if (index == size) {
            insertatlast(val);
            return;
        }

        Node temp = new Node(val);
        Node x = head;

        for (int i = 1; i < index; i++) {
            x = x.next;
        }

        temp.next = x.next;
        x.next = temp;

        size++;
    }

    int size() {
        return size;
    }

    int get (int idx){
        if (idx==size-1) return tail.val ;
        if (idx>=size || idx < 0) {
            System.out.println("error");
            return -1 ; 
        }
        Node temp = head ; 
        for (int i = 0; i <= idx; i++) {
            temp = temp.next ;
        }    
        return temp.val ;
        
    }
   void deleteathead() throws Error {
    if (head==null) throw new Error("bhai dikkat hai") ;

    head = head.next ;
    size -- ; 
   }
   void delete(int idx) throws Error{
    if (head==null) throw new Error("bhai dikkat hai") ;
    Node temp = head ; 
    for (int i = 1; i <=idx-1; i++) {
      temp = temp.next ;
    }
    temp.next = temp.next.next ;
   }
    void display() {
        Node temp = head;

        while (temp != null) {
            System.out.print(temp.val + " ");
            temp = temp.next;
        }

        System.out.println();
    }
}

public class q6_getmethod{
    public static void main(String[] args) {

        SLL list = new SLL();

        list.insertatlast(10);
        list.insertatlast(20);
        list.insertatlast(30);
        list.insertatlast(40);

        list.display();
        System.out.println("Size = " + list.size());

        list.insertathead(50);
        list.display();
        System.out.println("Size = " + list.size());

        list.insert(3, 100);
        list.display();
        System.out.println("Size = " + list.size());

        list.insert(6, 200);
        list.display();
        System.out.println("Size = " + list.size()); 
        
        list.display();
        System.out.println(list.get(4)) ;
        list.display();
        list.deleteathead();
        list.display();
        list.delete(3);
        list.display();
        
    }
}