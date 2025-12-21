import java.util.*;
public class Hashing {
    public static void main(String args[]) {
        HashMap<String, Integer> map = new HashMap<>();
        //Inserion Operation
        map.put("India", 120);
        map.put("United States",30);
        map.put("China",150);
        System.out.println(map);
        map.put("China", 180);
        System.out.println(map);
        // Search
        if(map.containsKey("Indonesia")) {
            System.out.println("Key is present in the map");
        } else {
            System.out.println("Key is not present in the map");
        }
        System.out.println(map.get("China"));//key exist
        System.out.println(map.get("Indonesia"));//key doesn't exist
        
    }
}

