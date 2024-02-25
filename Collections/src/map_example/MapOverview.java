package map_example;

import java.util.HashMap;
import java.util.Map;

public class MapOverview {
    public static void main(String[] args) {
        //Map<Key, Value> numbersMap = new HashMap<>();
        //HashMap<Key, Value> numbersMap = new HashMap<>();
        Map<String, String> countryCodeMap = new HashMap<>();
        countryCodeMap.put("us", "United States");
        countryCodeMap.put("br", "Brazil");
        countryCodeMap.put("es", "Spain");

        countryCodeMap.get("br");
    }
}
