import java.util.Scanner;
public class AttendanceChecker {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of classes: ");
        int n = scanner.nextInt();
        int presentDays = 0;
        int absentDays = 0;
        System.out.println("Enter the days u are Present as '1' and Absent as '0' .");
        for(int i = 0; i<n;i++){
            System.out.print("Enter the attendance of day " + (i+1) + ": ");
            int input = scanner.nextInt();
            if(input == 1){
                presentDays++;
            }else{
                absentDays++;
            }
        }
        System.out.println("The number of present days are/is " + presentDays);
        System.out.println("The number of absent days are/is : " + absentDays);
        if(presentDays * 100 >= 75 * n){
            System.out.println("Eligible for Exams");
        }else{
            System.out.println("Not Eligible");
        }
        scanner.close();
    }
}
