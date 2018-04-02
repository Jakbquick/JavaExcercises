
public class TriangleTester {
	public static void main(String args[]) {
		boolean tri = isTriangle(12,1,1);
		if (tri == true) {
			System.out.println("That triangle is possible");
		}
		else
			System.out.println("That triangle is not possible");
	}
	/**
	 * Takes in three numbers and tests to see if it is possible for them to form a triangle based on their
	 * lengths
	 * @param num1 - one side of triangle
	 * @param num2 - one side of triangle
	 * @param num3 - one side of triangle
	 * @return
	 */
	public static boolean isTriangle(int num1, int num2, int num3) {
		if (num1 > num3 + num2) {
			return false;
		}
		else if (num2 > num1 + num3)
			return false;
		else if (num3 > num1 + num2)
			return false;
		else
			return true;
	}
}
