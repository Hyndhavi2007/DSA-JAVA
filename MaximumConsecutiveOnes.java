import java.util.Scanner;
public class MaximumConsecutiveOnes {
   public static void main(String[] args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter a binary array");
    // A binary array is an array that contains only 0s and 1s.
    System.out.print("Enter the size of the array");
    int a = scanner.nextInt();
    int[]arr = new int[a];
    System.out.println();
    System.out.print("Enter the "+ a+ " elements (0s and 1s): ");
    for(int i = 0;i<a;i++){
        arr[i] = scanner.nextInt();
    }
    int currentCount = 0;
    int maxCount = 0;
    for(int num:arr){
        if(num == 1){
            currentCount +=1;
        maxCount = Math.max(maxCount,currentCount);
        } else {
            currentCount = 0;
        }
    }
    System.out.println("Maximum consecutives 1s: " + maxCount);
    scanner.close();

   } 
}
