import java.util.Scanner;
public class Greetings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int button = scanner.nextInt();
        if ( button == 1 ) {
            System.out.println("Hello!");
        } else if ( button == 2 ) {
            System.out.println("Namaskar");
        } else if ( button == 3 ) {
            System.out.println("Bonjour");
        } else {
            System.out.println("Invalid button");
            scanner.close();

        }
    }      

}
    
    

