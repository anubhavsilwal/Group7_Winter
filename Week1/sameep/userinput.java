import java.util.Scanner;

public class userinput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String uname = "new";
        int pass = 12345;
        String username;
        int password;

        System.out.println("Enter the username");
        username = sc.nextLine();

        System.out.println("Enter the password!");
        password = sc.nextInt();

        if (username.equals(uname) && password == pass) {
            System.out.println("The username  and password is correct!");
        } else if (!username.equals(uname) && password == pass) {
            System.out.println("the username is incorrect and but password is correct!");
        } else if (username.equals(uname) && password != pass) {
            System.out.println("the username is correct but password is incorrect");
        } else {
            System.out.println("the username and password is incrrect");
        }
        sc.close();
    }

}
