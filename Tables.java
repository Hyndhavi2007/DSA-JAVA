import java.util.Scanner;
public class Tables {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to print its multiplication table: ");
        int number = scanner.nextInt();
        for (int i = 1; i <= 20; i++){
            System.out.println(number + " x " + i + " = " + number * i);
            scanner.close();
        }
    }  
    
}
