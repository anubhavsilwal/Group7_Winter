import java.util.Scanner;

public class Voting {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the length:");
        int length = sc.nextInt();

        System.out.println("Enter the breadth:");
        int breadth = sc.nextInt();

        int area = length * breadth;
        System.out.println(area);

        sc.close();

        // Ternary operator usage
        String result = (area < 38) 
                        ? "You need bigger value" 
                        : "You need smaller value";
        System.out.println(result);
    }
}