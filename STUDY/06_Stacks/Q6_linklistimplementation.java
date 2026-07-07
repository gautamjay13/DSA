public class Q6_linklistimplementation {

    public static class Node {
        int val ;
         Node next ;
        Node(int val){
            this.val = val ;
        }
    }
    public static class LLStack{
        Node head = null ; 
        int size = 0 ; 
        void push(int x){
            Node temp = new Node(x);
            temp.next = head ; 
           head = temp ;
           size++ ; 
        }
        void display(){
            Node temp =head ;
            while (temp!=null) {
                System.out.print(temp.val+" ");
                temp = temp.next ;
            }
            System.out.println();
        }
        int size(){
            return size; 
        }
        int pop(){
           if(head==null) {
            System.out.println("stack is rempty");
            return -1 ;
           }
           int x = head.val ;
           head = head.next ;
           size--;
           return x ;
          
        }
        int peek(){
          if(head==null) {
            System.out.println("stack is rempty");
            return -1 ;
           } 
           return head.val ; 
        }
    }
    public static void main(String[] args) {
      LLStack st = new LLStack() ;
      st.push(4);
      st.display();
      st.push(5);
      st.display();
      st.push(10);
      st.display();
      System.out.println("the size of the stacks: "+st.size);
      st.pop() ;
      st.display();
       System.out.println("the size of the stacks: "+st.size);

    }
}
