import java.util.Scanner;
public class TemperatureAnalyzer {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of days: ");
        int n = scanner.nextInt();
        int Hot = 0;
        int Warm = 0;
        int Cold = 0;
        for(int i = 0; i < n; i++){
            System.out.print("Enter the temperature of day " + (i+1) + ":");
            int temp = scanner.nextInt();
            if(temp>= 35){
                Hot++;
            }else if(temp >= 25 && temp <= 34){
                Warm++;
            }else{
                Cold++;
            }
        }
        System.out.println("Hot Days : " + Hot);
        System.out.println("Warm Days: " + Warm);
        System.out.println("Cold Days: " + Cold);
        if(Hot>=Cold){
            System.out.println("Summer Mood");
        }else{
            System.out.println("Cool Weather");
        }
        scanner.close();
    }
}
