import java.util.Scanner;

public class LongestSubarry {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the size of the Array: ");
        int a = scanner.nextInt();

        int[] arr = new int[a];

        System.out.print("Enter " + a + " elements: ");
        for (int i = 0; i < a; i++) {
            arr[i] = scanner.nextInt();
        }

        System.out.println("The Array You have Entered is:");
        for (int num : arr) {
            System.out.print(num + " ");
        }

        System.out.println();

        System.out.print("Enter the value of K: ");
        int k = scanner.nextInt();

        int left = 0;
        int sum = 0;
        int maxlen = 0;

        for (int right = 0; right < a; right++) {
            sum += arr[right];

            while (sum > k) {
                sum -= arr[left];
                left++;
            }

            if (sum == k) {
                maxlen = Math.max(maxlen, right - left + 1);
            }
        }

        System.out.println("Length of Longest Subarray with sum " + k + " is: " + maxlen);

        scanner.close();
    }
}
