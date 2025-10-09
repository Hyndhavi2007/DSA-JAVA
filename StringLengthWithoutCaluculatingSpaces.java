import java.util.Scanner;
public class StringLengthWithoutCaluculatingSpaces {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Text:");
        String text = scanner.nextLine();
        System.out.println("The text you entered is: " + text);
        System.out.println();
        int textLength = text.length();
        System.out.println("The length of the text is: " + textLength);
        System.out.println();
        String noSpaces = text.replace(" "," ");
        int length = noSpaces.length();
        System.out.println("The length of the text without spaces is: " + length);
        System.out.println();
        scanner.close();
        
    }
}
