public class ThreeDArray {
    public static void main(String[]args){
        int nums[][][] = new int[3][3][3];
        for(int i = 0; i< nums.length;i++){
            for(int j = 0; j< nums[i].length;j++){
                for(int k = 0; k< nums[i][j].length;k++){
                    nums[i][j][k] = (int)(Math.random() * 100);
                }
            }
        }
        System.out.println("3D Array");
        for(int n[][] : nums){
            for(int m[] : n){
                for(int o : m){
                    System.out.print( o + " ");
                }
                System.out.println(); // next row
            }
            System.out.println(); // next layer
        }
        }
}
