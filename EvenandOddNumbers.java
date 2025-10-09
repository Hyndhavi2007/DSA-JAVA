import java.util.Scanner;
public class EvenandOddNumbers {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number n: ");
        int n = sc.nextInt();
        int EvenCount = 0;
        int OddCount = 0;
        int sum = 0;
        System.out.println(" The Even Numbers are: ");
        for (int i = 1; i <=n; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                EvenCount++;

            }
        }
        System.out.println();
        
        System.out.println("The Odd Numbers are: ");
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.print(i+" ");
                OddCount++;
            }
        }
        System.out.println();
       
        for(int i=1;i<=n;i++){
            sum = sum + i;
        }
        System.out.println();
        
        System.out.println("Sum of numbers from 1 to "+n+" is: "+sum);
        System.out.println("The count of even numbers  from 1 and "+ n +" is: " + EvenCount);
        System.out.println("The count of odd numbers from 1 and " + n + " is: " +  OddCount);

     sc.close();
    }  
}


    

    
