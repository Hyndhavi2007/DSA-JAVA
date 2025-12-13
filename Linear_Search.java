import java.util.Scanner;
public class Linear_Search{
public static  int linearSearch(int arr[],int key){
    int a = arr.length;
    for(int i =0;i<a ;i++){
        if(arr[i] == key) {
         return i;
    }
   }
   return -1;
}
    public static void main(String [] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Size of the Array: ");
        int n = scanner.nextInt();
        int[]arr = new int[n];
        System.out.println("Enter "+ n + " elements");
        for(int i = 0; i < n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("The Array You Entered ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        System.out.print("Enter the element to search: ");
        int key = scanner.nextInt();
        int result = linearSearch(arr,key);
        if(result == -1){
            System.out.println("Element is not found in the array.");
        }else {
            System.out.println("Element found at index: " + result);
        }
        scanner.close();

    }
}

