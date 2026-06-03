
public class StringMethods {
    public static void main(String[] args) {

        // Concatenation using +
        String firstName = "Max";
        String lastName = "Verstappen";

        String fullName = firstName + " " + lastName;
        System.out.println("Concatenation using + : " + fullName);

        // charAt()
        String name = "Daniel";
        System.out.println("Character at index 0: " + name.charAt(0));
        System.out.println("Character at index 1: " + name.charAt(1));

        // concat()
        String fullName2 = firstName.concat(" ").concat(lastName);
        System.out.println("Using concat(): " + fullName2);

        // hashCode()
        String s1 = "Max";
        String s2 = new String("Max");

        System.out.println("s1.equals(s2): " + s1.equals(s2));
        System.out.println("s1.hashCode(): " + s1.hashCode());
        System.out.println("s2.hashCode(): " + s2.hashCode());
    }
}