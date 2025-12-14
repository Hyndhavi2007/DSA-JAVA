import java.util.Scanner;
public class SingleNumber {
    public static void main(String[]args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter an array in which every integer appears twice except one integer.");
        System.out.println();
        System.out.print("Enter the size of the Array: ");
        int a = scanner.nextInt();
        int[]arr = new int[a];
        System.out.println();
        System.out.print("Enter the "+a+" elements ");
        for(int i =0;i<a;i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println();
        System.out.print("The Array you have enterd is ");
        for(int num: arr){
            System.out.print(num + " ");
        }
        System.out.println();
        int count = 0;
        for(int num: arr){
            count ^= num;
        }
        System.out.println();
        System.out.println("The Numbered that appeared once: "+count);
        scanner.close();
    }
}

