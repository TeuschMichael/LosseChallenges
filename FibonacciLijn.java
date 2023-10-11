public class FibonacciLijn {

	public	static void main(String[] args) {
	
	System.out.println(calc(7));	
	}
	
	public static int calc(int number) {
		return number <= 2 ? 1 : calc(number-1) + calc(number-2);
	}
}