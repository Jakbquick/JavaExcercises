
public class IterativeFactorial {
	public static void main(String args[]) {
		System.out.println(factorial(3));
	}

	public static int factorial(int num) {
		int product = 1;
		for (int i = num; i >= 1; i--) {
			product *= i;
		}
		return product;
	}
}
