import java.util.HashMap;
import java.util.Map;
public class Iteration{
    public static void main(String[] args){
        HashMap<String,Integer>map = new HashMap<>();
        map.put("India",120);
        map.put("United States",100);
        map.put("Canada",90);
        map.put("China",150);
        System.out.println(map);
        map.put("China",180);
        System.out.println(map);
        int arr[] = {12, 15, 18};
        // Normal  for Loop
        for(int i = 0; i<3;i++) {
            System.out.print(arr[i] +" ");
        }
        System.out.println();
        // Enhanced for loop
        for(int val : arr) {
            System.out.print(val + " ");
        }
        System.out.println();
        // Iterating through HashMap
        for(Map.Entry<String,Integer> e : map.entrySet()){
        System.out.println(e .getKey());
        System.out.println(e .getValue());
        }
        for(Map.Entry<String,Integer>e:map.entrySet()) {
            System.out.println(e.getKey() + " -> " + e.getValue());
        }
    }
}