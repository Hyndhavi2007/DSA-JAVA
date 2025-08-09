public class SecondLargestElement {
    public static int secondLargest(int[] nums) {
        if (nums == null || nums.length < 2) return -1;

        int largest = Integer.MIN_VALUE;
        int second = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > largest) {
                second = largest;
                largest = num;
            } else if (num > second && num < largest) {
                second = num;
            }
        }

        return (second == Integer.MIN_VALUE) ? -1 : second;
    }

    public static void main(String[] args) {
        int[] nums = {3, 5, 2, 5, 1};
        System.out.println(secondLargest(nums)); // Output: 3
    }
}
