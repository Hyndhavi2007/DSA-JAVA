import java.util.Scanner;
public class SmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of elements: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements: ");
        for (int i = 0; i<n;i++){
            array[i] = sc.nextInt();

        }
        int min=array[0];
        for (int i = 1; i<n;i++){
            if (array[i]<min) {
                min=array[i];

            }

        }
        System.out.println("The smallest element from the input is: "+min);
        sc.close();
        

    }
    
}
