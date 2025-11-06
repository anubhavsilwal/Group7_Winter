import java.util.Scanner;

public class task {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double length;
        double breadth;
        double area;

        System.out.print("Enter the breadth of the rectangle: ");
        breadth = sc.nextDouble();

        System.out.print("Enter the length of the rectangle: ");
        length = sc.nextDouble();

        area = length * breadth;

        String result = (area > 35) ? "The area is large" : "The area is not large";
        System.out.println(result);
        System.out.println("The total area is " + area);
        sc.close();
    }

}
