
public class JaggedArray1 {
    public static void main(String[]args){
        int marks[][] = new int[3][];
        marks[0] = new int[6];
        marks[1] = new int[4];
        marks[2] = new int[5];
        //Assigning random marks using built in java method Math.random()
        for(int i =0; i< marks.length;i++){
            for(int j = 0; j< marks[i].length;j++){
                marks[i][j] = (int)(Math.random() * 101);
            }
        }
        for(int n[] : marks){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
