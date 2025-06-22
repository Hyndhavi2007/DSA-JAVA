import java.util.Scanner;
public class Even {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter a number");
    int n = sc.nextInt();
System.out.print(" The Even Numbers are : " );
    for (int i=0;i<=n;i+=2){
        System.out.print(i+",");
       
        
        
    }
    sc.close();
    
    }
    
}
