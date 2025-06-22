import java.util.Scanner;
public class ChatGptCasting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long l = scanner.nextLong();
        byte c = (byte) l ;
        System.out.println(c);
        scanner.close();

    }
}