import java.util.Scanner;
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number between 1 and 10: ");
        int button = scanner.nextInt(); 
        switch (button) {
            case 1: System.out.println("Hello!"); 
            break;
            case 2: System.out.println("Namaskaram");
            break;
            case 3: System.out.println("Bonjour");
            break;
            case 4: System.out.println("Ciao");
            break;
            case 5: System.out.println("Hola");
            break;
            case 6: System.out.println("Konichiwa");
            break;
            case 7: System.out.println("vannakam");
            break;
            case 8: System.out.println("Namaste");
            break;
            case 9: System.out.println("Sat Sri Akal");
            break;
            case 10: System.out.println("Namskar");
            break;
            default: System.out.println("Invalid button");
            scanner.close();
        }
    }
}