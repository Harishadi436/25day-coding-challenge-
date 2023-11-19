import java.util.Scanner;

public class UserAuthentication {

    public static void main(String[] args) {
       
        String correctUsername = "admin";
        String correctPassword = "password123";

        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter username: ");
        String enteredUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String enteredPassword = scanner.nextLine();

        
        if (correctUsername.equals(enteredUsername) && correctPassword.equals(enteredPassword)) {
            System.out.println("Authentication successful. Welcome, " + correctUsername + "!");
        } else {
            System.out.println("Authentication failed. Incorrect username or password.");
        }

        
        scanner.close();
    }
}
