public class Second_Largest_Element{
public static void main (String [] args){
    int arr[] = { 20,42,6,25,30,88};
    int n = arr.length;
    int max1;
    int max2;
    if(arr[0] > arr[1]){
        max1 = arr[0];
        max2 = arr[1];
    } else {
        max1 = arr[0];
        max2 = arr[1];
    }
    for(int i = 2; i<n;i++){
        if(arr[i] > max1){
            max2 = max1;
        max1 = arr[i];
    } else if( arr[i]>max2){
        max2 = arr[i];
    }
    }
    System.out.println("The Largest Element is "+ max1);
    System.out.println("The Second Largest Element is "+ max2);
}
}
