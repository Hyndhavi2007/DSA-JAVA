import java.util.Scanner;
public class PrimeNumber{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int count = 0;
        for( int i = 1; i<= n ;i++){
            if( n % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("The given number " + n + " is a Prime Number");
         }else{

         System.out.println("The given number " + n + " is not a Prime Number" );
         }
         scanner.close();
    }
}