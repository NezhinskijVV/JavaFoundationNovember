package collections.workWithMap;

import interfaces.Man;

import java.util.HashMap;
import java.util.Map;

public class MapRunner {
    public static void main(String[] args) {
        Map<String, Man> manMap = new HashMap<>();
        manMap.put("Gosha", new Man("George", 25));
        manMap.put("Einar", new Man("Einar", 32));
        manMap.put("Vitaliy", new Man("Vitaliy",29));

        manMap.put("Gosha", new Man("Vitaliy", 29));

        System.out.println(manMap.get("Gosha" ).getAge());



    }
}
