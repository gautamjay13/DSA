public class lessthan {
    public static void main(String[] args) {
        int [] arr = {10,20,30,40,50,60,70,80,90} ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]<35) {
                System.out.println("the index  whose number is less than 35 :" + i );
            }
        }
    }
}
