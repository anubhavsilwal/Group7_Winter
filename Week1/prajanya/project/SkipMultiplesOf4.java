import java.util.Scanner;

public class SkipMultiplesOf4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        for (int i = 1; i <= num; i++) {
            if (i % 4 == 0) {
                continue; // skip multiples of 4
            }
            System.out.print(i + " ");
        }
    }
}
