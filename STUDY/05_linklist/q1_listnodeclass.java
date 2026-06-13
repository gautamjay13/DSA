package linklist;

class Node {
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}
public class listnodeclass {
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        a.next = b; // 10 -> 20
        System.out.println(a);
        System.out.println(b);
        System.out.println(a.next);
        System.out.println(b.next);
        System.out.println(a.val);
        System.out.println(b.val);
    }
}
