import java.util.Scanner;
public class AlphabetAnimal {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the name of an animal.");
    String animalName = input.nextLine();

    char firstLetter = animalName.charAt(animalName.length() - 1);

    switch (firstLetter) {
    case 'a':
      System.out.println("Anaconda");
      break;
    case 'b':
      System.out.println("Bear");
      break;
    case 'c':
      System.out.println("Cat");
      break;
    case 'd':
      System.out.println("Donkey");
      break;
    case 'e':
      System.out.println("Eagle");
      break;
    case 'f':
      System.out.println("Falcon");
      break;
    case 'g':
      System.out.println("Gar");
      break;
    case 'h':
      System.out.println("Horse");
      break;
    case 'i':
      System.out.println("Ibex");
      break;
    case 'j':
      System.out.println("Jaguar");
      break;
    case 'k':
      System.out.println("Kiwi");
      break;
    case 'l':
      System.out.println("Lion");
      break;
    case 'm':
      System.out.println("Manta Ray");
      break;
    case 'n':
      System.out.println("Narwhal");
      break;
    case 'o':
      System.out.println("Otter");
      break;
    case 'p':
      System.out.println("Penguin");
      break;
    case 'q':
      System.out.println("Quail");
      break;
    case 'r':
      System.out.println("Rook");
      break;
    case 's':
      System.out.println("Seal");
      break;
    case 't':
      System.out.println("Turtle");
      break;
    case 'u':
      System.out.println("Urchin");
      break;
    case 'v':
      System.out.println("Viper");
      break;
    case 'w':
      System.out.println("Wallabi");
      break;
    case 'x':
      System.out.println("Xiphactinus");
      break;
    case 'y':
      System.out.println("Yapok");
      break;
    case 'z':
      System.out.println("Zebra");
      break;
    default:
      System.out.println("Not an animal");
    }
  }
}