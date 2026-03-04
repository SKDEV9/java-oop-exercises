package collections;
import java.util.LinkedHashMap;

public class HashMap {
    public static void main(String[] args) {

        java.util.HashMap<String, Integer> populationByCity = new java.util.HashMap<>();

        populationByCity.put("New York", 2300021);
        populationByCity.put("Las Vegas", 112234);
        populationByCity.put("San Fracisco", 113561);

        Integer population = populationByCity.get("New York");

        if (populationByCity.containsKey("New York")) {
            System.out.println("We got New York's population.");
        }

        populationByCity.keySet();
        populationByCity.values();
        populationByCity.entrySet();

        // LinkedHashMap preserva a ordem em que os elementos foram adicionados
        LinkedHashMap<String, Integer> ordereMap = new LinkedHashMap<>();
    }
}
