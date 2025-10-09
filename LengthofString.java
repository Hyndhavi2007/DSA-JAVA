import java.util.Scanner;
public class LengthofString {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text:");
        String input = scanner.nextLine();
        int length = input.length();
        System.out.println("The text you entered is: " + input);
        System.out.println("The length of the text is: " + length);
        scanner.close();
    }
}
