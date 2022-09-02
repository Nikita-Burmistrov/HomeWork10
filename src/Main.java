import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();
        map.put("Tiger", "Carnivorous");
        map.put("Leo", "Carnivorous");
        map.put("Parrot", "Herbivore");
        map.put("Bunny", "Herbivore");
        for (Map.Entry<String, String> entry : map.entrySet())
            System.out.println(entry.getKey() + "-" + entry.getValue());

        System.out.println(" ");

        System.out.println("It's carnivorous?");

        Map<String, String> map1 = new LinkedHashMap();
        map1.put("Tiger", "Carnivorous");
        map1.put("Leo", "Carnivorous");
        for (Map.Entry<String,String> entry : map1.entrySet()){
            System.out.println(entry.getKey() + "-" + entry.getValue() + " " + map1.containsValue("Carnivorous"));}

        System.out.println(" ");

        System.out.println("It's herbivore?");

        Map<String, String> map2 = new TreeMap();
        map2.put("Parrot", "Herbivore");
        map2.put("Bunny", "Herbivore");
        for (Map.Entry<String, String> entry : map2.entrySet())
            System.out.println(entry.getKey() + "-" + entry.getValue() + " " + map2.containsValue("Herbivore"));



    }
}