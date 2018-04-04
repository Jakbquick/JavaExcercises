
public class IterativeFactorial {
	public static void main(String args[]) {
		for (double i = .1; i <= 100; i *= 10) {
			System.out.println(outputResult(i));
		}
		System.out.println("");
		for (double i = -.1; i >= -100; i *= 10) {
			System.out.println(outputResult(i));
		}
	}

	public static int factorial(int num) {
		int product = 1;
		for (int i = num; i >= 1; i--) {
			product *= i;
		}
		return product;
	}

	public static double myExp(double x, int n) {
		double sum = 0;
		double term = 1;
		for (int i = 1; i <= n; i++) {
			sum += term;
			term = (term * x) / (i);
		}
		return sum;
	}

	public static String outputResult(double x) {
		return "" + x + "\t" + myExp(x, 200) + "\t" + Math.exp(x);
	}
}
