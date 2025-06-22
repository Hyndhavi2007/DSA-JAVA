import java.util.Scanner;
public class PrimeandCompositeNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        int primecount=0;
        int compositecount=0;
        int sum=0;
        System.out.println("The Prime Numbers are: ");
        for(int i=2;i<n;i++){
            if(isPrime(i)) {
                System.out.print(i+" ");
                primecount++;
            }
        }
        System.out.println();
        System.out.println("The Composite Numbers are: ");
        for(int i=2;i<n;i++){
            if(!isPrime(i)) {
                System.out.print(i+" ");
                compositecount++;
            }
        }
    System.out.println();
    for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println("The sum of all numbers is: "+sum);
        System.out.println("The count of prime numbers is: "+primecount);
        System.out.println("The count of composite numbers is: "+compositecount);
        sc.close();
    }

                public static boolean isPrime(int num) {
            if (num < 2) {
                return false;
            }
            for (int i = 2; i <= Math.sqrt(num);i++) {
                if (num % i == 0) {
                    return false;
            }
        }
        return true;
    
    }
    
}
