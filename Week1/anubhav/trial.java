import java.util.Scanner;

public class trial {
    public static void main(String[] args) {
        
        String correctUsername = "new";
        String correctPassword = "12345";
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter username: ");
        String username = scanner.nextLine();
        
        System.out.print("Enter password: ");
        String password = scanner.nextLine();
        
        if (username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("Both match");
        } else if (username.equals(correctUsername) && !password.equals(correctPassword)) {
            System.out.println("One is matched - Username matched");
        } else if (!username.equals(correctUsername) && password.equals(correctPassword)) {
            System.out.println("One is matched - Password matched");
        } else {
            System.out.println("Both not matched");
        }
        
        scanner.close();
    }
}