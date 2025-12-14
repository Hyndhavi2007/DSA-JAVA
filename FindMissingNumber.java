import java.util.Scanner;
public class FindMissingNumber {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the Array ");
        int a = scanner.nextInt();
        int [] arr = new int[a];
        System.out.print("Enter "+a+" elements ");
        for(int i =0;i<a;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.print("Enter the maximum number (range): ");
        int maxnumber = scanner.nextInt();
        int expectedSum = maxnumber * (maxnumber + 1) / 2;
        int actualSum = 0;
        for(int num : arr){
            actualSum += num;
        }
        int missingNumber = expectedSum - actualSum;
        System.out.println("Missing Number is: " + missingNumber);
        


    }
}
