package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashExam {
    public static void main(String[] args) {
        
        Map<String, Integer> hashMap = new HashMap<>();

        hashMap.put("one", 1);
        hashMap.put("two", 2);
        hashMap.put("three", 3);

        System.out.println("Initial HashMap: " + hashMap);

        String key = "four";
        int value = 4;
        hashMap.put(key, value);

        System.out.println("Updated HashMap: " + hashMap);
    }
}
