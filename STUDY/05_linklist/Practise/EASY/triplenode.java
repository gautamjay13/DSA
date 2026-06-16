class Node 
{
    int val ; 
    Node head ; Node next ; 
    Node(int val){
        this.val = val ; 
    }
}

public class triplenode {
    public static void main(String[] args) {
        Node a = new Node(10) ;
        Node b = new Node(20) ;
        Node c = new Node(30) ;
        a.next = b ; 
        b.next = c ;
        System.out.println(a);
        System.out.println(a.val);
        System.out.println(b);
        System.out.println(b.val);
        System.out.println(c);
        System.out.println(c.val);
        
    }
}
