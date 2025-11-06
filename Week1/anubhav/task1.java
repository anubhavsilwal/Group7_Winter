// // Check if divisible by 3 or 5, but not both

// public class task1 {
//     public static void main(String[] args) {
//         System.out.println("Numbers between 1 and 50 divisible by 3 or 5, but not both:");       
//         for (int i = 1; i <= 50; i++) {
//             if ((i % 3 == 0 || i % 5 == 0) && !(i % 3 == 0 && i % 5 == 0)) {
//                 System.out.print(i + " ");
//             }
//         }
//     }
// }
// public class task1 {
// }








// 

// import java.util.Scanner;

// public class task1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.print("Enter a number: ");
//         int number = scanner.nextInt();
        
//         System.out.println("Numbers from 1 to " + number + " (skipping multiples of 4):");
        
//         for (int i = 1; i <= number; i++) {
//             if (i % 4 == 0) {
//                 continue;
//             }
//             System.out.print(i + " ");
//         }
        
//         scanner.close();
//     }
// }

// public class task1 {
//     public static void main(String[] args) {
//         System.out.println("FizzBuzz for numbers 1 to 30:");
        
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

// public class task1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
        
//         System.out.println("Enter 10 integers:");
        
//         for (int i = 1; i <= 10; i++) {
//             System.out.print("Enter integer #" + i + ": ");
//             int number = scanner.nextInt();
            
//             if (number % 2 == 0 && number > 20) {
//                 System.out.println(number + " is even and greater than 20");
//             }
//         }
        
//         scanner.close();
//     }
// }







// public class task1 {
//     public static void main(String[] args) {
//         int sumEven = 0;
//         int productOdd = 1;
        
//         System.out.println("Numbers between 1 and 10:");
        
//         for (int i = 1; i <= 10; i++) {
//             System.out.print(i + " ");
            
//             if (i % 2 == 0) {
//                 sumEven += i;
//             } else {
//                 productOdd *= i;
//             }
//         }
        
//         System.out.println("\n\nSum of even numbers: " + sumEven);
//         System.out.println("Product of odd numbers: " + productOdd);
        
//         System.out.println("\nDetailed calculation:");
//         System.out.print("Even numbers: ");
//         for (int i = 2; i <= 10; i += 2) {
//             System.out.print(i + (i < 10 ? " + " : " = "));
//         }
//         System.out.println(sumEven);
        
//         System.out.print("Odd numbers: ");
//         for (int i = 1; i <= 9; i += 2) {
//             System.out.print(i + (i < 9 ? " × " : " = "));
//         }
//         System.out.println(productOdd);
//     }
// }






// public class task1 {
//     public static void main(String[] args) {
//         System.out.println("Numbers from 1 to 30:");
        
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

// public class task1 {
//     public static void main(String[] args) {
//         Scanner scanner = new Scanner(System.in);
//         final int CORRECT_PIN = 1234;
//         final int MAX_ATTEMPTS = 3;
//         int attempts = 0;
//         boolean accessGranted = false;
        
//         System.out.println("=== ATM PIN Verification System ===");
        
//         while (attempts < MAX_ATTEMPTS && !accessGranted) {
//             System.out.print("Enter your PIN: ");
//             int enteredPin = scanner.nextInt();
            
//             if (enteredPin == CORRECT_PIN) {
//                 accessGranted = true;
//                 System.out.println("Access Granted");
//             } else {
//                 attempts++;
//                 if (attempts < MAX_ATTEMPTS) {
//                     System.out.println("Incorrect PIN, try again");
//                     System.out.println("Attempts remaining: " + (MAX_ATTEMPTS - attempts));
//                 } else {
//                     System.out.println("Account locked");
//                 }
//             }
//             System.out.println();
//         }
        
//         scanner.close();
//     }
// }