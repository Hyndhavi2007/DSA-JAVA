import java.util.Scanner;
public class CharAt {
    public static void main(String[]args){
        Scanner scanner =  new Scanner(System.in);
        System.out.println("Enter your first name: ");
        String firstName = scanner.nextLine();
        System.out.println("Enter your middle name:");
        String middleName = scanner.nextLine();
        System.out.println("Enter your last name: ");
        String lastName = scanner.nextLine();
        String fullName = firstName + " " + middleName + " " + lastName;
        System.out.print(" The Length of your full name is: ");
        System.out.println(fullName.length());
        System.out.print("Your full name is " + fullName ); 
        System.out.println(" Characters in your full name: ");
        for (int i = 0; i < fullName.length(); i++){
            System.out.println(fullName.charAt(i));
        }
        scanner.close();
    }
}
