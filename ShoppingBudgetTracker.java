import java.util.Scanner;
public class ShoppingBudgetTracker {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of items: ");
        int items = scanner.nextInt();
        int Expensive = 0;
        int Medium = 0;
        int Cheap = 0;
        for(int i = 0; i< items; i++){
            System.out.print("Enter the price of items " + (i+1) + ": $ ");
            int cost = scanner.nextInt();
            if(cost>= 1000){
                Expensive++;
            }else if(cost <= 500 && cost >= 999){
                Medium++;
            }else{
                Cheap++;
            }
        }
        System.out.println("The Expensive items count is " + Expensive);
        System.out.println(" The Medium items count is " + Medium);
        System.out.println("The Cheap items count is " + Cheap);
        if(Expensive >= Medium){
            System.out.println("Highly Spending");
        } else {
            System.out.println("Budget Friendly");
        }
        scanner.close();
    }

    }

