public class Selection_Sort_withNoFunction {
    public static void main(String[] args){
        int nums[] = {6, 5, 2, 8, 3, 7};
        int minIndex = 0;
        int n = nums.length;
        int swap =0;
        System.out.println("The Array Before Sorting");
        for(int num: nums){
            System.out.print(num + " ");
        }
        for(int i = 0;i<n;i++){
           for(int j = i+1;j<n;j++){
             if(nums[minIndex] > nums[j]){

             
                  minIndex = j;
             }
            }
        
             swap = nums[minIndex];
             nums[minIndex] = nums[i];
             nums[i] = swap;
        }
             System.err.println(" \nThe Array After Sorting");
             for(int num: nums)
                System.out.print( num+" ");
    }
}
