public class CountOdd {
    public static void main(String[]args){
        int nums[] = new int[10];
         int count = 0;
        for(int i = 0; i < nums.length;i++){
            nums[i] = (int)(Math.random() * 100);
            System.out.print(nums[i] + " ");
        }
        System.out.println();
        for(int n : nums){
            if(n % 2 != 0){
                count++;
            }
        }
        System.out.println("The number of the odd numbers in the array is " + count);
    }
}

