public class Hollowrectangle{
    public static void main (String[]args){
        int n=5;
        int m=4;
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                if(i==0||i==n||i==n-1||j==n-1||j==m-1||j==0||j==m){
                    System.out.print(" # ");

                }else {
                    System.out.print(" . ");
                }

            }
            System.out.println();

        }   
    }
} 
