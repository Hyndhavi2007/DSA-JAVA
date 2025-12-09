import java.util.Scanner;
public class InsertionSort {
    public int[] insertionSort(int[] arr){
        int n = arr.length;
        for(int i = 1; i<n;i++){
            int key = arr[i];
            int j = i - 1;
            while(j>= 0 && arr[j] > key) {
                arr[j+1] = arr[j];
                j--;
            }
            arr[j+1] = key;
        }
        return arr;
    }

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
              System.out.println("Enter the size of the array: ");
              int a = scanner.nextInt();
              int arr[] = new int[a];
              for (int k = 0; k < a ; k++){
                System.out.println("Enter the " +(k +1) +" integer");
                arr[k] = scanner.nextInt();
              }
             InsertionSort Obj = new InsertionSort();
             Obj.insertionSort(arr);
             System.out.println("The Sorted Array is ");
             for(int b : arr)
                System.out.print(b + " ");
             scanner.close();


        
        }
}
/* Insertion Sort is a Simple comparision based algorithm. 
Here in the Insertion elements the elements are sorted by shifting.
How it Works?
1. Firstly, we take the current value as -> key
2. We will be comparing it with the elements to its left
3. And after that the elements  which are larger will be shifting one positon to the right.
4. Lastle the key wil be into the correct spot.
 */

