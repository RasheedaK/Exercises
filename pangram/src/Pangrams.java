import java.util.Arrays;
class Pangrams {
  static boolean isPangram(String string) {
    if (!(string.isEmpty())) {
      String newstring = string.replaceAll("[^A-Za-z]", "");
      return checkForPangram(newstring);
    }
    return false;
  }

  private static boolean checkForPangram(String newstring) {
    int countAlphabets = 0;
    newstring = newstring.toUpperCase();
    char[] chararray = newstring.toCharArray();
    Arrays.sort(chararray);
    for (int i = 0; i < chararray.length - 1; i++) {
      int difference = (int) chararray[i + 1] - (int) chararray[i];
      if (difference == 1)
        countAlphabets++;
    }
    return (countAlphabets==25);
  }
}
