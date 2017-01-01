import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.lang.Iterable;

public class DNA {
  String dnaseq;

  DNA(String dna) {
    this.dnaseq = dna;
  }

  Map<Character, Integer> dna = new HashMap<>();

  {
    dna.put('A', 0);
    dna.put('G', 0);
    dna.put('T', 0);
    dna.put('C', 0);
  }

  int count(char a) throws IllegalArgumentException {
    int nucleotide_count = 0;
    if (!dna.containsKey(a))
      throw new IllegalArgumentException();

    for (int i = 0; i < this.dnaseq.length(); i++) {
      if (this.dnaseq.charAt(i) == a)
        nucleotide_count++;
    }
    return nucleotide_count;
  }

  Map<Character, Integer> nucleotideCounts() {
    for (int i = 0; i < this.dnaseq.length(); i++) {
      dna.put(this.dnaseq.charAt(i), this.count(this.dnaseq.charAt(i)));
    }
    return dna;
  }
}
