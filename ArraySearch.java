public class ArraySearch {
    public static void main(String [] args){
        int [] marks = {75, 82, 90, 75, 68, 75,88};
        int searchkey = 75;
        int count = 0; 
        for(int i = 0; i< marks.length;i++){
            if(searchkey == marks[i]){
                System.out.println("The number " + searchkey+ " found in the array at the position " + i);
                count = count + i;
                count++;
            } 
        }
        System.out.println("Count = " + count);
    }
}
