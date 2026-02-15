import java.util.Scanner;
public class PracticeStreaker {
    public static void main(String[]main){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n = scanner.nextInt();
        int excellent = 0;
        int moderate = 0;
        int weak = 0;
        for(int i =0;i<n;i++){
            System.out.print("Enter the problems solved in day "+ (i+1)+ " ");
            int problemSolved = scanner.nextInt();
            if(problemSolved >= 5){
                excellent++;
            }else if(problemSolved >=2 && problemSolved<=4){
                moderate++;
            }else{
                weak++;
            }
        }
        System.out.println("Excellent days: " + excellent);
        System.out.println("Moderate days: " + moderate);
        System.out.println("Weak days: " + weak);
        if(excellent >= n/2){
            System.out.println("Strong Scholar Candidate");
        }else if(weak > excellent){
            System.out.println("Needs Improvement");
        }else{
            System.out.println("Average Day");
        }
        scanner.close();
    }
}