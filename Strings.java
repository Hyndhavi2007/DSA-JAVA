 import java.util.Scanner;

// Here the class is named Strings (plural), which does NOT conflict with the built-in java.lang.String.
// Java will still use the real String type for text.
public class Strings {
    public static void main(String[] args) {
        System.out.print("Enter your name: ");
        Scanner sc = new Scanner(System.in);
        // nextLine() returns java.lang.String (built-in class)
        // We're storing that in a variable of type java.lang.String — this works fine.
        String name = sc.nextLine();
        System.out.println("Your name is " + name);
        sc.close();
    }
}
