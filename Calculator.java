import java.util.Scanner;
public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter the second number: ");
        int b = scanner.nextInt();
        System.out.println("Choose Operation: ");
        System.out.println("1 = Addition (+)");
        System.out.println("2 = Subtraction (-)");
        System.out.println("3 = Multiplication (*)");
        System.out.println("4 = Division (/)");
        System.out.println("5 = Modulus (%)");
        int button = scanner.nextInt();
        switch (button) {
            case 1: System.out.println("Result: " + (a + b));
            break;
            case 2: System.out.println("Result: " + (a - b));
            break;
            case 3: System.out.println("Result: " + (a * b)); 
             break;
            case 4: if (b != 0) {
                    System.out.println("Result: " + (a / b)); 
                } else {
                    System.out.println("Error: Cannot divide by zero.");
                }
            break;

            case 5:int result = a % b;
                System.out.println("Result: " + result);
                if (result % 2 == 0) {
                    System.out.println("Even");
                } else { 
                    System.out.println("Odd");
                }
                break;

            default: System.out.println("Invalid operation selected.");
        }

        scanner.close(); 
    }    
}

