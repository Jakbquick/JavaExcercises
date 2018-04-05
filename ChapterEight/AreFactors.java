
public class AreFactors {
	public static void main(String args[]) {
		int[] arr = {2,4,8,16,32};
		if(areFactors(3,arr))
			System.out.println("This is Divisible");
		else
			System.out.print("this is not divisible");
	}
	public static boolean areFactors(int n, int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % n != 0) {
				return false;
			}
			
		}
		return true;
	}
}
