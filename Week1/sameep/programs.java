
//shopping cart program
import java.util.Scanner;

public class programs {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String item;
        double price;
        char currency = 's';
        int quantity;
        double total;

        System.out.print("What would you  like to buy? ");
        item = scanner.nextLine();

        System.out.print("What is the price of the " + item + " ");
        price = scanner.nextDouble();

        System.out.print("How many would u like?  ");
        quantity = scanner.nextInt();

        total = quantity * price;

        System.out.println("You have bought " + quantity + " " + item + "\s");
        System.out.println("Your total is " + total + currency);
        scanner.close();
    }

}
