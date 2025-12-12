import java.util.Scanner;
public class CheckifArrayisSorted {
        public static void main (String[] args){
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter the Size of the Array: ");
            int n = scanner.nextInt();
            int [] arr = new int[n];
            System.out.print("Enter the "+ n+ " Elements: ");
            for(int i = 0;i<n;i++){
                arr[i] = scanner.nextInt();
            }
            System.out.print("You Entered: ");
            for(int num: arr) {
                 System.out.print(num +" ");
            }
            System.out.println();
            boolean isSorted = true;
            for(int j = 1;j< n;j++){
                if (arr[j]< arr[j-1]){
                    isSorted = false;
                    break;
                }
               }
                  if(isSorted) {
                    System.out.println("The Array is Sorted");
                  } else{
                    System.out.println("The Array is Not Sorted");
                  }
                  scanner.close();
        }
}