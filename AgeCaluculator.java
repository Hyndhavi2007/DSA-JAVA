import java.util.Scanner;
import java.time.LocalDate;
import java.time.Period;
public class AgeCaluculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth: ");
        int year = scanner.nextInt();
        int month = scanner.nextInt();
        int day = scanner.nextInt();
        LocalDate birthDate = LocalDate.of(year,month,day);
        LocalDate currentDate = LocalDate.now();
        Period age = Period.between(birthDate, currentDate);
        System.out.println("You are" + age.getYears() + "years, " + age.getMonths() + "months, " + age.getDays() + "days old. ");
        scanner.close();
    }
}
