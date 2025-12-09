public class BubbleSortWithNoFunction {
    public static void main(String [] args){
        int nums[] = { 6, 9, 10, 2, 1, 3};
        int n = nums.length;
       int temp = 0;
       System.out.println("The Array Before Sorting");
       // Enhanced for Loop
       for(int num : nums){
        System.out.print( num + " ");
       }
       for(int i = 0; i< n; i++){
        for(int j = 0;j<n - 1;j++){
            if(nums[j] > nums[j+1]){
             temp = nums[j];
             nums[j] = nums[j+1];
             nums[j+1] = temp;
            }
        }
       }
       System.out.println();
       System.out.println("The Sorted Array after the Bubble Sort is");
       // Enhanced  for loop
       for(int num: nums){
        System.out.print(num + " ");
       }
    }
    /* enhanced for loop --> It is a simplified loop structure used to iterate
    through all elements of a collection or array without using an index.*/

}

