import java.util.Scanner;
public class StudyHour {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of days: ");
        int n = scanner.nextInt();
        int productive = 0;
        int normal = 0;
        int lazy = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Enter the number of hours studied in day: " + (i+1) + " ");
            int hour = scanner.nextInt();
            if(hour >= 6){
                productive++;
            }else if(hour >= 3 && hour <= 5){
                normal++;
            }else{
                lazy++;
            }
        }
        System.out.println("Productive days: " + productive);
        System.out.println("Normal days: " + normal);
        System.out.println("Lazy days: " + lazy);
        if(productive >= n/2){
            System.out.println("Top Perfomance");
        }else if(lazy > productive){
            System.out.println("Needs Discipline");
        }else{
            System.out.println("Consistent");
        }
        scanner.close();
    }
}
