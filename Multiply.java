import java.util.Scanner;
public class Multiply {
    public static int caluculateProduct(int a,int b){
        int product = a * b;
        return product;
    }
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the two numbers: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int product = caluculateProduct(a,b);
        System.out.println("The product of the two numbers is: " + product);
        scanner.close();
    }
 }

