public class Practical {
    public static void main(String[] args) {
        // Call the print method and store its return value
        String result = print();
        // Print the result
        System.out.println(result);
    }
    
    // Method should be outside the main method
    public static String print() {
        String a = "abcd";
        return a; // Return the value of 'a'
    }
}
