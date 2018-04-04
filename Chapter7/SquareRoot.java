
public class SquareRoot {
	public static void main(String args[]) {
		System.out.println(squareRoot(9.0));
	}

	public static double squareRoot(double num) {
		double first = num;
		double second = num;
		do {
			second = first;
			first = ((first / 2) + (num / (first / 2))) / 2;
		} while (Math.abs(first - second) > .00001);
		return first;
	}
}
