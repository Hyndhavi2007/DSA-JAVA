import java.util.Scanner;
public class TypeCasting{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Widening ( smaller to larger )
        System.out.println("Enter the value a: ");
        int a = sc.nextInt();
        double b = a ;
        System.out.println("Value of b is "+b);
        // Narrowing ( larger to smaller)
        System.out.println("Enter the value c: ");
        short c = sc.nextShort();
        byte d = (byte)c;
        System.out.println("Value of d is "+d);
        sc.close();
    } 

}