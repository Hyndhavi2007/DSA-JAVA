import java.util.Scanner;
public class BubbleSort {
    public int[] bubbleSort(int [] arr){
        int n = arr.length;
        for(int i = 0; i< n -1;i++){
           boolean swapped = false;
           for(int j = 0;j<n- i -1;j++){
            if(arr[j] > arr[j+1]) {
                int temp = arr[j];
                arr[j] = arr[j+1];
                arr[j+1] = temp;
                swapped = true;
            }
           }
           if(!swapped)
            break;
        }
        return arr;
    }
    public  static void main( String[] args ){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the size of the array: ");
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter integer" + (i+1)+ ":");
            arr[i] = scanner.nextInt();
        }
        BubbleSort Obj = new BubbleSort();
        Obj.bubbleSort(arr);
         System.out.print("The Sorted Array: ");
         for(int z : arr)
            System.out.print(z + " ");
        scanner.close();

    }
}
/* Bubble Sort  is one of the simplest comparison-based sorting algorithms.
 It  repeatedly steps through the list, compares adjacent elements, 
 and swaps them if they are in the wrong order. 
 This Process continues until the list becomes sorted.
   How Bubble Sort Works?
 1. Start at the beginning of the array.
 2.Compare the first two elements.
 3. If the first element is greater than the second, swap them.
 4. Move to the next pair of elements and repeat Step 3.
 5. Continue until you reach the end of the array—this completes **one pass**.
 6.After each pass, the **largest element “bubbles up” to the end** of the array.
 7. Repeat the passes for the remaining unsorted part of the array until no swaps are needed.*/