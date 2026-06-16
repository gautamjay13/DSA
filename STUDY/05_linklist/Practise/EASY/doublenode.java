class Node {
    int val;
    Node head;
    Node next;

    Node(int val) {
        this.val = val;

    }
}

public class doublenode {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        a.next = b;
        System.out.println(a);
        System.out.println(a.val);
        System.out.println(b);
        System.out.println(b.val);
    }

}
