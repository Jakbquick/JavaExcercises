
public class Multadd {
	public static double multadd(double a, double b, double c) {
		return a * b + c;
	}
	public static void main(String args[]) {
		//System.out.println(multadd(.5,Math.cos((Math.PI)/4),Math.sin(Math.PI/4)));
		System.out.println(expSum(1));
	}
	public static double expSum(double a) {
		//return (a * Math.exp(a*-1)) + (Math.pow(1 - (Math.exp(a * -1)), .5));
		return multadd(a,Math.exp(a*-1),(Math.pow(1 - (Math.exp(a * -1)), .5)));
	}
}
