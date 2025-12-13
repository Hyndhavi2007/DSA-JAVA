import java.util.Scanner;
public class ArrayUnion {
   public static int[] arrayUnion(int[]arr1,int[]arr2){
    int c = arr1.length;
    int d = arr2.length;
    int k = 0;
    int[] temp = new int[c + d];
    for(int i = 0; i < c;i++){
        temp[k++] = arr1[i];
    }
    for(int i = 0; i< d;i++){
        boolean found = false;
        for(int j =0; j < k;j++){
            if(arr2[i] == temp[j]){
                found = true;
                break;
            }
        }
        if(!found) {
            temp[k++] = arr2[i];
        }
    }
    int [] union = new int[k];
    for(int i =0;i<k;i++) {
        union[i] = temp[i];
    }
    return union;
   }
    public static void main(String [] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the 1st Array: ");
        int a = scanner.nextInt();
        int []arr1 = new int[a];
        System.out.println("Enter "+ a + " elements");
        for(int i = 0; i < a; i++){
            arr1[i] = scanner.nextInt();
        }
        System.out.print("The Array 1 You have Entered  ");
        for(int num1: arr1){
            System.out.print(num1 + " ");
            
        }
        System.out.println();
        System.out.print("Enter the size of the 2nd Array: ");
        int b = scanner.nextInt();
        int []arr2 = new int[b];
        System.out.println("Enter "+ b + " elements. ");
        for(int j = 0; j < b;j++){
            arr2[j] = scanner.nextInt();
        }
        System.out.print("The Array 2 You have Entered  ");
        for(int num2: arr2){
            System.out.print(num2 + " ");
            
        }
        System.out.println();
        int[] unionArray = arrayUnion(arr1,arr2);
        System.out.println("Union of the two Arrays");
        for(int num:unionArray){
            System.out.print(num + " ");
        }
        scanner.close();

    }
}
