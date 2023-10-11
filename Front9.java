public class Front9 {

  public static void main(String[] args) {

    int[] numberArr = new int[] {
      1,
      9,
      2,
      3
    };
    //System.out.println(numberArr[2]);
	    int[] numberArr2 = new int[] {
      2,
      5,
      7,
      3
    };

    System.out.println(Front9(numberArr));
	System.out.println(Front9(numberArr2));
  }

  public static boolean Front9(int...number) {

    for (int i = 0; i < number.length; i++) {
      if (number[i] == 9) {
        return true;
      }
    }
    return false;
  }
}