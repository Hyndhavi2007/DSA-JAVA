import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;
public class GradeHM {
    public static void main(String[] args){
        HashMap<String, Integer> grades = new HashMap<>();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number of Students: ");
        int a = scanner.nextInt();
        scanner.nextLine();
        // Input names and marks
        for(int i = 0; i <= a;i++) {
            System.out.print("Enter student name: ");
            String name = scanner.nextLine();
            System.out.print("Enter marks: ");
            int marks = scanner.nextInt();
            scanner.nextLine();
            grades.put(name, marks);
        }
        System.out.println("\n ==================Student Graades==================");
        for(String name : grades.keySet()) {
            int marks = grades.get(name);
            System.out.println(name + " : "+ marks + " -> Grade "+ getGrade(marks));
        }
        scanner.close();
    }
    public static String getGrade(int marks){
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }
}
