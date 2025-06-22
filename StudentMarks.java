import java.util.Scanner;
public class StudentMarks {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int choice;
        while(true){
            System.out.println("Enter 1 to input marks, 0 to stop.");
            choice = input.nextInt();
            if(choice == 0){
                System.out.println("Program Stopped");
                break;

            }else if(choice==1){
                System.out.println("Enter students marks (out of 100)");
                int marks = input.nextInt();
                if (marks >= 90 && marks <= 100){
                    System.out.println(" This is Good");
                    
                } else if ( marks >=60 && marks <= 89){
                    System.out.println("This is also good");
                } else if (marks >=0 && marks <= 59){
                    System.out.println("This is Good as well");
                }else{
                    System.out.println("Invalid Marks entered (must be 0-100).");
                }
                System.out.println(" Marks dont matter but our effort does.");
                }else{
                    System.out.println("Invalid choice. Please enter 1 or 0");
            }
        }
        input.close();
    }
}    

