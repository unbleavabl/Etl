import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.Map.Entry;

public class Etl {
    public Map<String, Integer> transform(Map<Integer, List<String>> old) {
	Map<String, Integer> newMap = new HashMap<String, Integer>();
	for(Map.Entry<Integer, List<String>> m : old.entrySet()){
		Integer value = m.getKey();
		List<String> lists = m.getValue();
		for(String character:lists){
			newMap.put(character.toLowerCase(),value);
		}
	}
        return newMap;
    }
}


