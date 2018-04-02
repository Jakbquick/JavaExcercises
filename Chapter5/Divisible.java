
public class Divisible {
	public static void main(String args[]) {
		int n = 6;
		int m = 2;
		boolean divis = isDivisible(n,m);
		if (divis == true) {
			System.out.println(""+n+" is divisible by " + m);
		}
		else {
			System.out.println(""+n+" is not divisible by " + m);
		}
	}
	public static boolean isDivisible(int n, int m) {
		if (n%m == 0) {
			return true;
		}
		return false;
	}
}
