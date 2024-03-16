import java.util.*;
public class PS5{

    public static void main(String[] args) {
        String[] passwords = new String[10];
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter 10 passwords:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Password " + (i+1) + ": ");
            passwords[i] = scanner.nextLine();
        }

        System.out.println("\nHere are the passwords you entered:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Password " + (i+1) + ": " + passwords[i]);
        }

        for (int i = 0; i < passwords.length; i++) {
            if ("apsit".equals(passwords[i])) {
                System.out.println("Found");
            }
        }

        scanner.close();
    }
}