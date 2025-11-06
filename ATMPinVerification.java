// public class DivisibleCheck {
//     public static void main(String[] args) {
//         System.out.println("Numbers between 1 and 50 divisible by 3 or 5, but not both:");

//         for (int i = 1; i <= 50; i++) {
//             if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
//                 System.out.println(i);
//             }
//         }
//     }
// }

// import java.util.Scanner;

// public class SkipMultiplesOf4 {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in); 

//         System.out.print("Enter a number: ");
//         int number = input.nextInt(); 

//         System.out.println("Numbers from 1 to " + number + " (skipping multiples of 4):");

//         for (int i = 1; i <= number; i++) {

//             if (i % 4 == 0) {
//                 continue; 
//             }

//             System.out.println(i);
//         }

//         input.close(); 
//     }
// }

// public class FizzBuzzExample {
//     public static void main(String[] args) {

//         System.out.println("FizzBuzz from 1 to 30:");

//         for (int i = 1; i <= 30; i++) {

//             if (i % 3 == 0 && i % 5 == 0) {
//                 System.out.println("FizzBuzz");
//             }
//             else if (i % 3 == 0) {
//                 System.out.println("Fizz");
//             }
//             else if (i % 5 == 0) {
//                 System.out.println("Buzz");
//             }
//             else {
//                 System.out.println(i);
//             }
//         }
//     }
// }


// import java.util.Scanner;

// public class EvenAndGreaterThan20 {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in); 

//         System.out.println("Enter 10 integers:");

//         for (int i = 1; i <= 10; i++) {
//             System.out.print("Enter number " + i + ": ");
//             int num = input.nextInt();

//             if (num % 2 == 0 && num > 20) {
//                 System.out.println(num + " is even and greater than 20");
//             }
//         }

//         input.close();  
//     }
// }

// public class EvenOddCalculator {
//     public static void main(String[] args) {
//         int evenSum = 0;
//         int oddProduct = 1;

//         for (int i = 1; i <= 10; i++) {
//             if (i % 2 == 0) {
//                 evenSum += i; 
//             } else {
//                 oddProduct *= i; 
//             }
//         }

//         System.out.println("Sum of even numbers between 1 and 10: " + evenSum);
//         System.out.println("Product of odd numbers between 1 and 10: " + oddProduct);
//     }
// }

// public class CustomNumberPrinter {
//     public static void main(String[] args) {
//         for (int i = 1; i <= 30; i++) {
//             if (i == 15) {
//                 System.out.println("skip");
//             } else if (i % 4 == 0) {
//                 System.out.println(i * 2); 
//             } else {
//                 System.out.println(i);
//             }
//         }

//         System.out.println("done"); 
//     }
// }


// import java.util.Scanner;

// public class ATMPinVerification {
//     public static void main(String[] args) {

//         Scanner input = new Scanner(System.in);

//         int correctPIN = 1234; 
//         int attempts = 3;      

//         System.out.println("=== ATM PIN Verification ===");
//         for (int i = 1; i <= attempts; i++) {
//             System.out.print("Enter your 4-digit PIN: ");
//             int enteredPIN = input.nextInt();
//             if (enteredPIN == correctPIN) {
//                 System.out.println("Access Granted ");
//                 break;  
//             } else {
//                 if (i < attempts) {
//                     System.out.println("Incorrect PIN, try again.");
//                 } else {
//                     System.out.println("Account locked ❌");
//                 }
//             }
//         }

//         input.close();
//     }
// }
