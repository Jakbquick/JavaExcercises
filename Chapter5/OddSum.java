import java.util.Scanner;

public class OddSum {
	public static void main(String args[]) {
		System.out.println("Please enter a positive interger to get the sum of all odd numbers from 1 to n ");
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		System.out.println(oddSum(n));
	}

	/**
	 * returns the sum of the odd numbers from 1 to the number passed as a parameter
	 * 
	 * @param n - the number desired to return the sum of the numbers from one to that number
	 * @return the sum of odd numbers from one to the number inputed
	 */
	public static int oddSum(int n) {
		if (n < 0) {
			return 0;
		}
		else if (n <= 0) {
			return 0;
		} else {
			if (n % 2 == 1) {
				return n + oddSum(n - 1);
			} else {
				return 0 + oddSum(n - 1);
			}
		}
	}
}
