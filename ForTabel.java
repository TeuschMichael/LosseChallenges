public class ForTabel {

	public static void main(String[] args) {
	
	int number = 10;
	
	for (int i = 1; i <= number; i++) {
		for (int j = 1; j <= number; j++) {
			if (i == 0 && j == 0) {
				System.out.println("*");
			}
			System.out.print(i * j + " ");
			}
		}
	} 
}

