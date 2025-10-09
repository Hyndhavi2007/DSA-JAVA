import java.util.Scanner;
public class GreaterNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
       
        int b = scanner.nextInt();
        if ( a == b ) {
            System.out.println("Both numbers are equal");
        } else {
            if ( a > b){
                System.out.println("First number is greater");
            } else {
                System.out.println("First number is lesser");
                scanner.close();
            
        }
            }
    }  
}
           
    
    
        

