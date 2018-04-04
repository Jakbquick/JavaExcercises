
public class IterativePower {
	public static void main(String args[]) {
		System.out.println(power(9.2, 3));
	}

	public static double power(double base, int pow) {
		double result = base;
		for (int i = 1; i < pow; i++) {
			result *= base;
		}
		return result;
	}
}
