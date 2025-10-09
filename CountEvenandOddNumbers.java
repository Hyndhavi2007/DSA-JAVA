import java.util.Scanner;
public class CountEvenandOddNumbers {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Given Array: ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i] + ",");
        }
        int evenCount = 0;
        int oddCount = 0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evenCount++;
        }else{
            oddCount++;
        }
    }
    System.out.println();

    System.out.print("Total even numbers: "+ evenCount);
    System.out.println();
    System.out.print("Total odd numbers: "+ oddCount);   
    sc.close(); 
  }
}
