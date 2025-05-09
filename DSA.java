public class DSA {
    public static void main(String[] args) {
       
       java.lang.String d = "thippesj";
       int count = 0;
       
       for (int i = 0; i < d.length(); i++) {
           if (d.charAt(i) == ' ') {
               count++;
           }
       }
       
       // Print the count after the loop
       System.out.println(count); // Outputs: 0 since there are no spaces in "thippesj"
    }
}
