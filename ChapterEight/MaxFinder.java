
public class MaxFinder {
	public static void main(String args[]) {
		int[] arr = {2,5,3,4,1,2};
		System.out.println(maxInRange(arr,1,3));
	}

	public static int maxInRange(int[] arr, int lowIndex, int highIndex) {
		if (lowIndex == highIndex) {
			return arr[lowIndex];
		}
		int mid = (lowIndex + highIndex) / 2;
		return Math.max(maxInRange(arr, lowIndex, mid), maxInRange(arr, (mid + 1), highIndex));
	}
}
