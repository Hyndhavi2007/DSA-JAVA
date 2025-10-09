import java.util.Scanner;
public class Patterns{
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter how many rows: ");
        int rows = sc.nextInt();
        System.out.print("enter how many columns: ");
        int columns = sc.nextInt();
        System.out.println(" the pattern you asked : ");
        for (int i = 1; i<=rows;i++){
            for (int j = 1; j<=columns;j++){
                System.out.print("  *  ");

            }
        System.out.println("  ");
        }
        sc.close();
    }
}