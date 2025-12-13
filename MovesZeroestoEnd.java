import java.util.Scanner;
public class MovesZeroestoEnd {
   public static void moveZeroestoEnd(int[]arr){
    int k = 0;
    int a = arr.length;
    for(int i = 0;i<a;i++){
        if(arr[i] != 0){
            arr[k] =arr[i];
            k++;
        }
    }
    while(k<a){
        arr[k] = 0;
        k++;
    }
   }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an Array with Zeroes");
        System.out.print("Enter the Size of the Array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        System.out.print("Enter "+ n + " elements: ");
        for(int i =0 ;i< n;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println("The Array You have Entered is ");
        for(int num:arr){
            System.err.print( num + " ");
        }
        moveZeroestoEnd(arr);
        System.out.println();
        System.out.println("Array After moving Zeros to end: ");
        for(int num:arr){
            System.out.print(num + " ");
        }
       scanner.close();
    }
}
