import java.util.Scanner;
public class Stringusingnext {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter text: ");
        String input = scanner.next();
        System.out.println("The Text you have enterd is: "+ input);
        scanner.close();
        //NOTE
        // next()  reads only one word,it stops at space,tab or new line
        //It leaves the rest of line in the input buffer.
        //It does not include spaces in the result.
    }
}
