public class Q13_linearsearcch {
    public static void main(String[] args) {
        int [] arr = { 10,20,30,40,50,60,70,80,90} ;
        int x = 90 ;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==x) {
                System.out.println("element is found : " + i + " and the element is " + arr[i]);
            }
        }
    }
}
