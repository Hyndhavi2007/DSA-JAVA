import java.util.Scanner;
public class ElectricityBill {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of units consumed: ");
        int units = sc.nextInt();
        System.out.println("Senior Citizen (Yes/No):  ");
        String Senior = sc.next();
        double bill;;
        if(units <= 100){
            bill = units * 2;
        } else if(units <= 200){
            bill = units * 3;
        } else if(units <= 300){
            bill = units * 5;
        } else{
            bill = units * 7;
        }
        if(Senior.equalsIgnoreCase("Yes")) {
            bill = bill - (bill * 0.10);
        }
        System.out.println("Electricity Bill = $"+ bill);
        sc.close();
    }
}
