import java.util.Arrays;

public class PowArray {
	public static void main(String args[]) {
		double[] arr1 = {2.0, 3.2, 2.4, 3.0};
		System.out.println(Arrays.toString(powArray(arr1)));
	}
	public static double[] powArray(double[] arr){
		double[] newArray = new double[arr.length];
		for (int i = 0; i< arr.length;i++) {
			newArray[i] = Math.pow(arr[i], 2);
		}
		return newArray;
	}
}
