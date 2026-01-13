import java.util.Scanner;
class Total{
    public int add(int a, int b){
   System.out.println("In Addition");
    return a + b;
    }
}
public class Addition {
    public static void main (String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of a: ");
        int a = scanner.nextInt();
        System.out.print("Enter the value of b: ");
        int b = scanner.nextInt();
        Total total = new Total();
         int result = total.add(a,b);
        System.out.println("The sum of the two values is " + result);
        scanner.close();
        

    }
}
