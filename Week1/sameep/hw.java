// import java.util.Scanner;

// public class hw {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// QN1
/*
 * for (int i = 1; i <= 50; i++) {
 * if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0))
 * System.out.println(i);
 * }
 */

// QN2
/*
 * int num;
 * System.out.println("enter a number ");
 * num = sc.nextInt();
 * 
 * for (int i = 1; i <= num; i++) {
 * if (i % 4 != 0) {
 * System.out.println(i);
 * }
 * }
 */

// QN3
/*
 * for (int i = 1; i <= 30; i++) {
 * if (i % 3 == 0 && i % 5 == 0) {
 * System.out.println("FizzBuzz" + i);
 * } else if (i % 3 == 0) {
 * System.out.println("Fizz" + i);
 * } else if (i % 5 == 0) {
 * System.out.println("Buzz" + i);
 * }
 * }
 */

// QN4
/*
 * for (int i = 1; i <= 10; i++) {
 * System.out.print("enter the number " + i + ":");
 * int num = sc.nextInt();
 * 
 * if (num % 2 == 0 && num > 20) {
 * System.out.println("valid" + num);
 * 
 * }
 * }
 */

// QN5
/*
 * int sumeven = 0;
 * int proodd = 1;
 * for (int i = 1; i <= 10; i++) {
 * if (i % 2 == 0) {
 * sumeven += i;
 * } else {
 * proodd *= i;
 * }
 * }
 * System.out.println("the total sum of even and odd is" + sumeven + "  " +
 * proodd);
 */

// QN6
/*
 * for (int i = 1; i <= 30; i++) {
 * if (i == 15) {
 * System.out.println("skip");
 * } else if (i % 4 == 0) {
 * System.out.println(i * 2);
 * } else {
 * System.out.println(i);
 * }
 * }
 * System.out.println("done");
 */

// QN7

/*
 * int correctpin = 1234;
 * int attempts = 0;
 * 
 * while (attempts < 3) {
 * System.out.print("Enter PIN: ");
 * int enteredPin = sc.nextInt();
 * 
 * if (enteredPin == correctpin) {
 * System.out.println("Access Granted");
 * return;
 * } else {
 * attempts++;
 * if (attempts < 3) {
 * System.out.println("Incorrect PIN, try again.");
 * }
 * }
 * }
 * System.out.println("Account locked.");
 * 
 * sc.close();
 * }
 * 
 * }
 */
