import java.util.Scanner;
public class Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= n; i++){
            sum = sum + i;
        }
        System.out.println("Sum of first " + n + " natural numbers is: " + sum);
        sc.close();
}
}