import java.util.HashMap;
public class WoordenTeller {

  public static void main(String[] args) {

    String text = "De boer liep over het weiland in de ochtend";
    int count = 0;
    int vowelCount = 0;
    char letter;

    for (int i = 0; i < text.length(); i++) {
      if (text.charAt(i) != ' ') {
        count++;
      }
    }
    String[] words = text.split("\\s+");

    for (int i = 0; i < text.length(); i++) {
      char ch = text.charAt(i);
      if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
        vowelCount++;
      }
    }

    //HashMap<Int, Char> diagram = new HashMap<>
    System.out.println();
    System.out.println("Aantal letters: " + count);
    System.out.println("Aantal woorden: " + words.length);
    System.out.println("Aantal klinkers: " + vowelCount);
    System.out.println();

    for (letter = 'a'; letter <= 'z'; ++letter) {
      System.out.print(letter + " ");
    }
  }
}