
class Stack {
    int[] arr = new int[5];
    int idx = 0;

    void push(int x) {
        arr[idx] = x;
        idx++;
    }

    int peek() {
        if (idx == 0) {
            System.out.println(" the stacks is empty");
            return -1;

        }
        return arr[idx - 1];
    }

    int pop() {
        if (idx == 0) {
            System.out.println(" the stacks is empty");
            return -1;

        }
        int top = arr[idx - 1];
        arr[idx - 1] = 0;
        idx--;
        return top;
    }
    void display(){
       for (int i = 0; i < idx-1; i++) {
        System.out.print(arr[i]+ " ");
       } 
       System.out.println();
    }

    int size (){
        return idx ;
    }

}

public class arrayimplementatio {
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(4);
        st.push(5);
        st.push(6);
        st.push(7);
        st.display(); // 4556
        System.out.println("the size of the stacks : "+st.size()); // 4
        st.pop();
        st.display(); // 455
    }

}