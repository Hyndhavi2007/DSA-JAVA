import java.util.Scanner;
public class StringConcatMethod {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first text:");
        String firstInput = scanner.nextLine();
        System.out.println("Enter second text:");   
        String secondInput = scanner.nextLine();
        System.out.println("Enter third text:");
        String thirdInput = scanner.nextLine();
        String result = firstInput.concat(" ").concat(secondInput).concat(" ").concat(thirdInput); 
        System.out.println();
        System.out.println("The concatenated text is: " + result);
        scanner.close();
        // NOTE
        // The concat() method is used to concatenate strings.
        // It joins the strings together without adding any spaces unless specified.
        // In this example, we use concat() to join three strings with a space between the
        // second and third strings.

     }
}
