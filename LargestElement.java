import java.util.Scanner;
public class LargestElement {
    public static void main(String[]args){
     Scanner scanner = new Scanner(System.in);
     System.out.println("Enter the size of the array: ");
     int n = scanner.nextInt();
     int[] array = new int[n];
     System.out.println("Enter the elements of the array: ");
     for(int i=0;i<n;i++) {
        array[i] = scanner.nextInt();
     }
     int max = array[0];
     for(int i=1;i<n;i++) {
        if(array[i]> max) {
            max = array[i];
        }

     }
     System.out.println("The largest element from given input is: "+ max);
     scanner.close();
    }
}
