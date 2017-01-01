import java.util.HashMap;
import java.util.Map;

class WordCount {
  private Map<String, Integer> actualWordCount = new HashMap<>();

  Map<String, Integer> phrase(String word) {
    String newstring = word.replaceAll("[^A-Za-z0-9]", " ");
    newstring = newstring.replaceAll("( )+", " ");

    return wordCount(newstring);
  }

  private Map<String, Integer> wordCount(String newstring) {
    String[] stringList = newstring.split(" ");
    for (String string : stringList) {
      string = string.toLowerCase();
      if (!(actualWordCount.containsKey(string))) {
        actualWordCount.put(string, 1);
        continue;
      }
      int value = actualWordCount.get(string);
      actualWordCount.put(string, ++value);
    }
    return actualWordCount;
  }
}
