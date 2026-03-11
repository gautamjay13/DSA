public class substring {
    public static void main(String[] args) {
        // substring mtlb abcd - a ab abc acbd ; 
        String s = "abcde" ;
        System.out.println(s.substring(1)+" "+s.substring(2));
        System.out.println(s.substring(1,4));
        // end index agar dete hai toh j-1 tak print hoga

        for (int i = 0; i < s.length(); i++) {
            for (int j = i+1; j < s.length(); j++) {
                System.out.println(s.substring(i,j)); 
            }
           

        }
    }
}
