import java.util.Scanner;

public class SmartScoreAnalyzer {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the value of input 'n': ");
        int n = scanner.nextInt();

        int Top = 0;
        int Average = 0;
        int Low = 0;

        int highest = Integer.MIN_VALUE;
        int lowest = Integer.MAX_VALUE;
        int sum = 0;

        for (int i = 0; i < n; i++) {

            System.out.print("Enter the marks of subject " + (i + 1) + ": ");
            int marks = scanner.nextInt();

            
            if (marks >= 80) {
                Top++;
            } else if (marks >= 50) {  
                Average++;
            } else {
                Low++;
            }

            
            if (marks > highest) {
                highest = marks;
            }

            
            if (marks < lowest) {
                lowest = marks;
            }

            
            sum += marks;
        }

        double avg = (double) sum / n;

        System.out.println("\nTop count: " + Top);
        System.out.println("Average count: " + Average);
        System.out.println("Low count: " + Low);

        System.out.println("Highest mark: " + highest);
        System.out.println("Lowest mark: " + lowest);
        System.out.println("Total sum: " + sum);
        System.out.println("Class average: " + avg);

        if (Top >= Low) {
            System.out.println("Strong Class");
        } else {
            System.out.println("Weak Class");
        }

        scanner.close();
    }
}
