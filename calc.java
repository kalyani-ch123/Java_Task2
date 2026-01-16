
import java.util.Scanner;

public class calc {

    // -------- STATIC VARIABLE --------
    // Shared among all objects, stored in Method Area
    static String appName = "Console Calculator";

    // -------- INSTANCE VARIABLE --------
    // Each object has its own copy, stored in Heap
    int instanceCounter = 1;

    public static void main(String[] args) {

        // -------- LOCAL VARIABLES --------
        // Exist only inside main(), stored in Stack
        Scanner sc = new Scanner(System.in);

        System.out.println("Welcome to " + appName);

        /*
         * 1. PRIMITIVE DATA TYPES & MEMORY USAGE
         */
        byte b = 10;           // 1 byte (used for small numbers)
        short s = 100;         // 2 bytes
        int i = 1000;          // 4 bytes (default integer type)
        long l = 100000L;      // 8 bytes (large integers)

        float f = 10.5f;       // 4 bytes (decimal, less precision)
        double d = 20.55;      // 8 bytes (default for decimals)

        char c = 'A';          // 2 bytes (Unicode character)
        boolean flag = true;   // 1 bit (true/false)

        System.out.println("\nPrimitive Data Types:");
        System.out.println("byte: " + b);
        System.out.println("short: " + s);
        System.out.println("int: " + i);
        System.out.println("long: " + l);
        System.out.println("float: " + f);
        System.out.println("double: " + d);
        System.out.println("char: " + c);
        System.out.println("boolean: " + flag);

        /*
         * 2. ACCEPT USER INPUT
         */
        System.out.print("\nEnter first number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a number.");
            return;
        }
        double num1 = sc.nextDouble();

        System.out.print("Enter second number: ");
        if (!sc.hasNextDouble()) {
            System.out.println("Invalid input! Please enter a number.");
            return;
        }
        double num2 = sc.nextDouble();

        System.out.println("\nChoose operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");

        System.out.print("Enter choice: ");
        if (!sc.hasNextInt()) {
            System.out.println("Invalid choice!");
            return;
        }
        int choice = sc.nextInt();

        /*
         * 3. BASIC ARITHMETIC OPERATIONS
         * 5. INVALID INPUT HANDLING
         */
        double result = 0;
        boolean validOperation = true;

        switch (choice) {
            case 1:
                result = num1 + num2;
                break;
            case 2:
                result = num1 - num2;
                break;
            case 3:
                result = num1 * num2;
                break;
            case 4:
                if (num2 == 0) {
                    System.out.println("Division by zero is not allowed.");
                    return;
                }
                result = num1 / num2;
                break;
            default:
                validOperation = false;
                System.out.println("Invalid operation selected.");
        }

        /*
         * 6. FORMATTED OUTPUT
         */
        if (validOperation) {
            System.out.printf("\nResult: %.2f%n", result);
        }

        /*
         * 4. TYPE CASTING
         */
        int castInt = (int) result;      // Explicit casting (double → int)
        double castDouble = castInt;     // Implicit casting (int → double)

        System.out.println("\nType Casting Demo:");
        System.out.println("Double to Int (Explicit): " + castInt);
        System.out.println("Int to Double (Implicit): " + castDouble);

        /*
         * 7. INSTANCE VARIABLE DEMO
         */
        calc obj = new calc();
        System.out.println("\nInstance Counter Value: " + obj.instanceCounter);

        sc.close();
        System.out.println("\nThank you for using " + appName);
    }
}
