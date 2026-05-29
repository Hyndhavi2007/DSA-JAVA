public class JaggedArray2 {
    public static void main(String[]args){
        int employee[][] = new int[4][];
        employee[0] = new int [12];
        employee[1] = new int [15];
        employee[2] = new int [6];
        employee[3] = new int[2];
        for(int i = 0; i < employee.length;i++){
            for(int j = 0; j< employee[i].length;j++){
                employee[i][j] = (int)(Math.random() * 9000 + 1000);
            }
        }
        for(int n[]: employee){
            for(int m: n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
