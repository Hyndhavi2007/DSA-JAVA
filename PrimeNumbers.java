import java.util.Scanner;
public class PrimeNumbers {
   public static void main (String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter start of the number: ");
    int start = sc.nextInt();
    System.out.println("enter end of the number: ");
    int end = sc. nextInt();
    for (int n = start; n<= end; n++){
        int count = 0;
    for(int i = 1; i <= n; i++){
        if(n % i == 0){
        count++;
        }
    }
    if(count == 2){
        System.out.println("The numbers are ");
        System.out.println(n + " " );
    }
}
   sc.close();
}
}
