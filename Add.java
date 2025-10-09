import java.util.Scanner;

public class Add {
    public static int sumTwoNumbers(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers to get the sum:");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int sum = sumTwoNumbers(a, b);
        System.out.println("The sum of the two numbers is: " + sum);
        scanner.close();
    }
}
