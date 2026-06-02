public class sumEnhancedforLoop {
    public static void main(String[]args){
        int nums[] = { 12, 56, 89,54,4,100};
        int count = 0;
         int sum = 0;
        for(int n : nums){
            count++;
            sum = sum + n;
        }
        System.out.println("The length of the array is " + count );
        System.out.println("The sum of the elements in the array is " + sum);
    }
}
