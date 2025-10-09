public class SortedArraybyBubblesort{

    public static void main(String[]args){
        int[]arr={5,2,8,1,9};   
        bubbleSort(arr);
        System.out.println("Sorted array: " );
        for(int num:arr){
            System.out.print(num + " ");
        }
    }
    public static void bubbleSort(int[]arr){
        int n = arr.length;
        boolean swapped;
        //outer loop for number of passes
        for(int i=0;i<n-1;i++){//runs foe n-1 passes here i represents the no of passes completed so far.
            swapped=false;
            //inner loop for comparisions i.e for each pass, it compares adjacent elements
            for (int j = 0;j<n-1-i;j++){//runs for n-1-i comparisions in each pass
                //swaps if the elements are in the wrong order
                if(arr[j]>arr[j+1]){//if the current element is greater than the next element, swap them
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    swapped=true; //set swapped to true if a swap occurs
                }
            }
            // stops if no swaps were made in the inner loop, meaning the array is sorted
            if(!swapped){
                break; // no swaps means the array is already sorted
            }
           
        } 
    }
}