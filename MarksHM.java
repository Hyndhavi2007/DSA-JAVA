import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class MarksHM{
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        Map<String, Integer>marksData = new HashMap<>();
        System.out.print("Enter the number of students: ");
        int n = scanner.nextInt();
        scanner.nextLine();
        //Loop for taking the input 
        for(int i = 0; i < n; i++){
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
        

        System.out.print("Enter Marks: ");
        int marks = scanner.nextInt();
        scanner.nextLine();

        marksData.put(name, marks);
        }
        System.out.println(" \nStudent Marks: ");
        for(Map.Entry<String, Integer> entry : marksData.entrySet()) {
            System.out.println(entry.getKey() + " ->" + entry.getValue());

        }
        scanner.close();

        
        }
        
    }
   

