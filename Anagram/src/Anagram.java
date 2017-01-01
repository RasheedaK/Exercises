import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Anagram {
  private final String string;

  Anagram(String string) {

    this.string = string;
  }

  List<String> match(List<String> strings) {
    String uppercasestring = this.string.toUpperCase();
    char[] temp_array= uppercasestring.toCharArray();
    Arrays.sort(temp_array);
    String stringone = new String(temp_array);
    return checkAnagrams(strings,stringone);
  }
  private List<String> checkAnagrams(List<String> strings, String stringone) {
    List<String> anagrams = new ArrayList<>();
    for (String newstring : strings) {
      if (!(newstring.equalsIgnoreCase(this.string))) {
        String upperCaseString = newstring.toUpperCase();
        char[] temp_chararray = upperCaseString.toCharArray();
        Arrays.sort(temp_chararray);
        String stringtwo = new String(temp_chararray);
        if (stringone.equals(stringtwo)) {
          anagrams.add(newstring);
        }
      }
    }
    return anagrams;
  }
}
