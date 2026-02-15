import java.util.Scanner;
public class MaximumNumber{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the value of input numbers 'n' value: ");
        int n = scanner.nextInt();
        int numbers[] = new int[n];
        for(int i = 0; i < n; i++){
            System.out.println("Enter the value of number " + (i+1) + ": ");
            numbers[i] = scanner.nextInt();
        }
        int max = numbers[0];
        for(int i = 0; i < n;i++){
            if(numbers[i] > max){
                max = numbers[i];
            }
        }
        System.out.println("The Largest number is " + max);
        scanner.close();

    }
}