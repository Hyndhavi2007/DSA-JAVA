import java.util.Scanner;
public class StringusingnextLine {
 public static void main(String[]args){
    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter text: ");
  String input = scanner.nextLine();
    System.out.println("The Text you have entered is: "+ input);
    scanner.close();
    //NOTE
    // nextLine() reads the entire line including spaces until a new line is encountered.
    // It captures all characters including spaces and tabs.
    // It does not leave any part of the line in the input buffer.
  }   
}
