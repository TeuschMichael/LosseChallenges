import java.util.Scanner;

class Factorial {

  public static void main(String[] args) {

    Scanner input = new Scanner(System.in);

    System.out.println("Please enter an integer greater than zero");
    int answer = input.nextInt();
    int result = 1;
    for (int i = 1; i <= answer; i++) {
      result *= i;
      System.out.println(result);
    }
  }
}
