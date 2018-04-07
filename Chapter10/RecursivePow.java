import java.math.BigInteger;

public class RecursivePow {
	public static BigInteger pow(int x, int n) {
		if (n == 0)
			// return 1;
			return BigInteger.valueOf(1);

		// int t = pow(x,n/2);
		BigInteger t = pow(x, n / 2);

		if (n % 2 == 0) {
			// return t*t;
			return t.multiply(t);
		} else {
			// return t*t*x;
			return t.multiply(t).multiply(BigInteger.valueOf(x));
		}
	}

	public static void main(String args[]) {
		System.out.println(pow(5, 300));
	}
}
