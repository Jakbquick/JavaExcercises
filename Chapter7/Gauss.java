
public class Gauss {
	public static void main(String args[]) {
		System.out.println(gauss(2, 100));
	}

	public static double gauss(double x, int n) {
		double sum = 0;
		double term = 1;
		for (int i = 1; i <= n; i++) {
			sum += term;
			term = term * ((-1 * (x * x)) / (i));
		}
		return sum;
	}
}
