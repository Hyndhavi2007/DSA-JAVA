import java.util.Scanner;
public class StudentResult {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks in subject 1: ");
        int m1 = sc.nextInt();
        System.out.println("Enter marks of Subject2: ");
        int m2 = sc.nextInt();
        System.out.println("Enter marks of Subject 3: ");
        int m3 = sc.nextInt();
        System.out.println("Enter Attendance percentage: ");
        double attendance = sc.nextDouble();
        if(attendance < 75){
            System.out.println("Detained");
        } else{
            double average = (m1+m2+m3)/3;
            System.out.println("Average = " + average);
            if(average >= 90 ){
                System.out.println("Excellent");
            } else if(average >= 75){
                System.out.println("Very good");
            } else if(average >= 60){
                System.out.println("good");
            } else{
                System.out.println("Needs Improvement");
            }
        }
        sc.close();
    }
}
