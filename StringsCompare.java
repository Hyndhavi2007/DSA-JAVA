import java.util.Scanner;
public class StringsCompare {
    public static void main(String[]args){
        Scanner scanner = new Scanner (System.in);
        // Comparing two Strings
        System.out.print("Name of first person: ");
        String name1 = scanner.nextLine();
        System.out.print("Name of second person: ");
        String name2 = scanner.nextLine();
        //Syntax for comparing two Strings
        if(name1.equals(name2)){
            System.out.println("Both name are same");
        } else {
            System.out.println("Both names are different");
        }
        // this checks 3 cases 
        // 1. if both name are same it returns value 0
        //2. if name1 > name2 it returns positive value 
        //3.if name1< name2 it returns negative value 
          scanner.close();
        }

    }

