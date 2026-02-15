import java.util.Scanner;
public class EvenorOddCOunter {
   public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.print("Enter the value of n: ");
    int n = scanner.nextInt();
    int even = 0;
    int odd = 0;
    for(int i =0; i<n;i++){
        System.out.print("Enter the value of number " + (i+1) + ": ");
        int num = scanner.nextInt();
        if(num %2 == 0){
            even++;
        }else{
            odd++;
        }
    }
    System.out.println("Number of even numbers are/is: " + even);
    System.out.println("Number of odd numberare/is: " + odd);
    if(even>odd){
        System.out.println("More Evens");
    }else{
        System.out.println("More Odds");
    }
    scanner.close();
   } 
}
