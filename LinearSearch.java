import java.util.Scanner;
public class LinearSearch {
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array:");
        for(int i=0;i<n;i++) {
            array[i] = sc.nextInt();
        }
        System.out.println();
        
        System.out.println("Given Array: ");
        for(int i=0;i<n;i++){
            System.out.print(array[i] + " ");
        }

        System.out.println();

        System.out.print("Enter the element to be searched:");
        int target = sc.nextInt();
        
        boolean found = false;
        for(int i=0;i<n;i++){
            if(array[i] == target) {
                System.out.println("The element"+ target+ "is found at index:"+i);
                found = true;
                break;
        }

    }
    if(!found){
        System.out.println("Element"+  target +"not found");
    }
    sc.close();
  }
}
