public class TypeCasting {
    public static void main(String[] args) {
        int num = 8;
        double num1 = num; // implicit type casting
        num1 = 8.2;
        int num2 = (int) num1; // explicit type casting
        System.out.println("num: " + num);
        System.out.println("num1: " + num1);
        System.out.println("num2: " + num2);
    }
}