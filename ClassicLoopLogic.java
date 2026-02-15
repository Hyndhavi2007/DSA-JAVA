import java.util.Scanner; 
public class ClassicLoopLogic {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Give the input of value of 'n': ");
        int n = scanner.nextInt();
        int sum = 0;
        for(int i = 0; i< n; i++){
            System.out.print("Enter the value of number " + (i+1) + ": ");
            int num = scanner.nextInt();
            sum = sum + num;
        }
        double average = (double)sum / n ;
        System.out.println("The Sum of the numbers " + n + " is " + sum);
        System.out.println("The average of the numbers is " + average);
        if(average >= 50){
            System.out.println("Above Average");
        }else{
            System.out.println("Below Average");
        }
        scanner.close();

    }
}
