import java.util.Scanner;
public class  Factorial{
    public static int printFactorial (int n){
        //loop
        if(n<0){
            System.out.println("Factorial is not defined for negative numbers");
        return -1;//to indicate an error
        }else if (n==0){
        System.out.println("The Factorial of 0 is 1.");
        return 1;
        }else{
            System.out.println("Invalid");
        }
        
        int factorial = 1;
        for (int i = n; i>=1; i--) {
            factorial = factorial * i;

        }
        System.out.println(factorial);
       return factorial;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number: ");
        int n = scanner.nextInt();
         int result = printFactorial(n);
        System.out.println("The factorial of the number "+ n +" is "+ result);
        scanner.close(); 
    }

    }
