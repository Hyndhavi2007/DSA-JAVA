
import java.util.HashMap;
public class SumHashMap {
    public static void main(String[] args){
        HashMap<Integer,Integer>map = new HashMap<>();
        int[]nums = {2,7,11,13};
        int target = 9;
        for(int i = 0; i< nums.length;i++){
            int value = target - nums[i];
            if (map.containsKey(value)) {
                System.out.println(map.get(value) + ", " + i);
                return;
            }

            map.put(nums[i], i);
        }

    }
}
