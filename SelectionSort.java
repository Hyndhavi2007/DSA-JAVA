import java.util.Scanner;
public class SelectionSort {
    public int[] SelectionSort(int[] nums) {
        int n = nums.length;
        for(int i = 0; i<n; i++){
            int minIndex = i;
            for(int j =i+1;j < n;j++) {
                if(nums[j] < nums[minIndex]) {
                    minIndex = j;
                }
            }
            int temp = nums[i];
            nums[i] = nums[minIndex];
            nums[minIndex] = temp;
        }
        return nums;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array");
        int n = scanner.nextInt();
        int []nums = new int[n];
        for(int i = 0;i<n;i++){
            System.out.print("Enter integer " + (i +1) + ": ");
            nums[i] = scanner.nextInt();
        }
        SelectionSort Obj = new SelectionSort();
        int[] sorted = Obj.SelectionSort(nums);
        System.out.println("The Sorted Array is");
        for(int x : sorted) {
            System.out.print(x +" ");
        }


    }
}
