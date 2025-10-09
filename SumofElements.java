import java.util.Scanner;
public class SumofElements {
   public static void main(String[]args) {
    Scanner input = new Scanner(System.in);
    System.out.println("Enter the size of the array: ");
    int n = input.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the elements of the array: ");
    for(int i = 0;i<n;i++){
        arr[i] = input.nextInt();
    }
    int sum = 0;
    for(int i = 0;i<n;i++) {
        sum = sum + arr[i];
    }
    System.out.println("Sum of array elements: " + sum);
    input.close();
   }
}
