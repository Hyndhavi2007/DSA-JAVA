 import java.util.Scanner;
 public class SquareArea {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the side of the square: ");
        int side = scanner.nextInt();
        double area = side * side;
        System.out.println("The area of the square is: " + area);
        scanner.close();
    }
 }
    
