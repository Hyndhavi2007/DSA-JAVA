import java.util.Scanner;

public class Function {

    public static void printMyName(String name) {
        System.out.println("Hello, my name is " + name);
        return;
    }

    public static void main(String []args) {
        Scanner scanner = new Scanner(System.in);  // create Scanner object
        String name = scanner.next();              // read input
        printMyName(name);                          // call method
        scanner.close();                            // close Scanner properly (INSIDE main)
    }
}
