
class Node {
int val ;
Node head ;
Node(int val){
    this.val = val ;
}
    
}
public class SingleNode {
    public static void main(String[] args) {
        Node a = new Node(10) ;
        System.out.println(a); // Node@251a69d7
        System.out.println(a.val); // 10
    }
}
