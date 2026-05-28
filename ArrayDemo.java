public class ArrayDemo {
    public static void main(String[]args){
        int nums[] = {5,7,8,9};
        nums[1] = 6;
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        int nums1[] = new int[4];
        nums1[0] = 90;
        nums1[1] = 80;
        nums1[2] = 70;
        nums1[3] = 60;
        System.out.println(nums1[0]);
        System.out.println(nums1[1]);
        System.out.println(nums1[2]);
        // by using loop
        for(int i = 0; i < nums.length;i++){
            System.out.println(nums[i]);
        }
        

    }
}
