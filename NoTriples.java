public class NoTriples {

	public static void main(String[] args) {
		
		int[] numberArr = new int[] {1, 1, 1, 2, 4, 5, 5};
		int[] numberArr2 = new int[] {1, 2, 3, 4, 5};
		
		System.out.println(noTriples(numberArr));
		System.out.print(noTriples(numberArr2));
		
	}

	public static boolean noTriples(int... number) {
		for (int i = 0; i < number.length -2; i ++) {
			int first = number[i+2];
			if (number[i + 1] == first && number[i + 2] == first) return false;
		} return true;
	}
}
