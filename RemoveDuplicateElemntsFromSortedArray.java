import java.util.Scanner;
public class RemoveDuplicateElemntsFromSortedArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = scanner.nextInt();
        int arr[] = new int[n];
        System.out.println("The Elements Which are Entered must be Sorted");
        System.out.println("Enter the "+ n + " elements");
        for(int i = 0;i<n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("The Array you Enterd");
        for(int num: arr){
            System.out.print(num +" ");
        }
         System.out.println();

         int[] temp = new int[n];
         int k = 0;
         
         temp[k++] = arr[0];

         for(int j = 0;j< n-1;j++) {
            if (arr[j] != arr[j+1]) {
                temp[k++] = arr[j+1];
            }
         }
         System.out.println("Array after removing duplicates: ");

         for(int i = 0; i < k; i++){
            System.out.print(temp[i] + " ");
         }

    }
        }

