import java.util.*;

public class ProductWiseSum {
    public static Map<String, Integer> calculateProductSum(Map<String, Integer>[] data) {
        Map<String, Integer> result = new HashMap<>();
        
        for (Map<String, Integer> entry : data) {
            for (Map.Entry<String, Integer> e : entry.entrySet()) {
                result.merge(e.getKey(), e.getValue(), Integer::sum);
            }
        }
        return result;
    }
    
    public static void main(String[] args) {
        Map<String, Integer> map1 = Map.of("Laptop", 50000, "Mouse", 500);
        Map<String, Integer> map2 = Map.of("Laptop", 25000, "Keyboard", 1500);
        Map<String, Integer> map3 = Map.of("Mouse", 1000, "Monitor", 8000);
        
        @SuppressWarnings("unchecked")
        Map<String, Integer>[] allMaps = new Map[]{map1, map2, map3};
        
        Map<String, Integer> total = calculateProductSum(allMaps);
        System.out.println(total);
        // Output: {Mouse=1500, Keyboard=1500, Laptop=75000, Monitor=8000}
    }
}