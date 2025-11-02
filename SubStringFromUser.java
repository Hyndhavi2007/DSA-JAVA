import java.util.Scanner;
public class SubStringFromUser {
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a String: ");
        String text = scanner.nextLine();
        System.out.println("Enter the start of the Index: ");
        int start = scanner.nextInt();
        System.out.println("Enter the end of the Index: ");
        int end = scanner.nextInt();
        if(start  >= 0 && end <= text.length() && start<end){
        String part = text.substring(start, end);
        System.out.println("Substring: " + part);
        }else{
        System.out.println("Invalid Indexes!!!");
        }
        scanner.close();
    }
    
}
