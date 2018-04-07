import java.math.BigInteger;

public class Big {
	public static BigInteger factorial(int num) {
		BigInteger big = BigInteger.valueOf(1);
		for (int i = num; i >= 1; i--) {
			BigInteger index = BigInteger.valueOf(i);
			big = big.multiply(index);
		}
		return big;
	}

	public static void main(String args[]) {
		for (int i = 1; i <= 30; i++) {
			System.out.println(i + "\t" + factorial(i));
		}
	}
}
