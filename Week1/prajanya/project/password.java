import java.util.Scanner;  
public class password {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String correctPassword = "OpenSesame";
        String userInput;

        do {
            System.out.print("Enter the password: ");
            userInput = scanner.nextLine();

            if (!userInput.equals(correctPassword)) {
                System.out.println("Incorrect password. Please try again.");
            }
        } while (!userInput.equals(correctPassword));

        System.out.println("Access granted.");
        scanner.close();
    }
} 