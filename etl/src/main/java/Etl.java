import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Etl {
  private Map<String, Integer> newMap = new HashMap<>();

  Map<String, Integer> transform(Map<Integer, List<String>> old) {
    for (Map.Entry<Integer, List<String>> entry : old.entrySet()) {
      int key = entry.getKey();
      List<String> stringList = entry.getValue();
      for (String eachString : stringList) {
        newMap.put(eachString.toLowerCase(), key);
      }
    }
    return newMap;

  }

}

