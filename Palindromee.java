public class Palindromee {
    public static void main(String[] args) {
        String a = "madam";
        String reversed = "";
		Scanner sc =new Scanner(System.in);
        for (int i = a.length() - 1; i >= 0; i--) {
            reversed = reversed + a.charAt(i);
        }
        System.out.println(reversed);
    }
}
