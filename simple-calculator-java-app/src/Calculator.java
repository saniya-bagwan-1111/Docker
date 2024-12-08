import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a, b= 0;
	double c=0.0;

        System.out.print("Enter the first number: ");
        a = in.nextInt();

        System.out.print("Enter the second number: ");
        b = in.nextInt();

        System.out.println("Choose the operation:" +
                "\n1. Addition" +
                "\n2. Subtraction" +
                "\n3. Multiplication" +
                "\n4. Division" +
                "\n5. Power (Square of A or B)" +
                "\nEnter the number of the operation: ");
        int operation = in.nextInt();

        switch (operation) {
            case 1: // Addition
                c = a + b;
                System.out.println(a + " + " + b + " = " + c);
                break;
            case 2: // Subtraction
                c = a - b;
                System.out.println(a + " - " + b + " = " + c);
                break;
            case 3: // Multiplication
                c = a * b;
                System.out.println(a + " * " + b + " = " + c);
                break;
            case 4: // Division
                if (b != 0) {
                    c = a / b;
                    System.out.println(a + " / " + b + " = " + c);
                } else {
                    System.out.println("Error: Division by zero is not allowed.");
                }
                break;
            case 5: // Power
                System.out.println("Choose the number to enhance:" +
                        "\n1. A (Square A)" +
                        "\n2. B (Square B)");
                int choice = in.nextInt();
                if (choice == 1) {
                    c = Math.pow(a, 2);
                    System.out.println("Square of " + a + " = " + c);
                } else if (choice == 2) {
                    c = Math.pow(b, 2);
                    System.out.println("Square of " + b + " = " + c);
                } else {
                    System.out.println("Invalid choice for enhancement.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
        }
    }
}

