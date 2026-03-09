public class countvowels {
    public static void main(String[] args) {
        String s = "JAY GAUTAM" ;
        int count = 0 ;
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if ( ch=='A' || ch=='E' ||ch=='I' ||ch=='O' ||
                ch=='U' )
            {
               count ++ ; 
            System.out.println("Vowel found: " + ch + " at index: " + i);
            }
        } 
        System.out.println(count);
        
        
    }
}
