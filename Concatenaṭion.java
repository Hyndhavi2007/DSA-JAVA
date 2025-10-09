import java.util.Scanner;
public class Concatenaṭion {
    public static void main(String[]args){
        Scanner scanner = new Scanner(System.in);
        // Concatenation -Means joining of two or more strings together into a single string.
        System.out.println("Enter first text:");
        String firstInput = scanner.nextLine();
        System.out.println("Enter second text:");
        String secondInput = scanner.nextLine();
        String concatenatedResult = firstInput + " " + secondInput; // Concatenating with a space in between
        System.out.println("The concatenated text is: " + concatenatedResult);
        scanner.close();
    

    }
}
