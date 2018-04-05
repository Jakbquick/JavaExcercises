import java.util.Arrays;
import java.util.Random;

public class Histogram {
	public static void main(String args[]) {
		int[] array = new int[100];
		Random random = new Random();
		for (int i = 0; i < array.length; i++) {
			array[i] = random.nextInt(100);
		}
		System.out.println(Arrays.toString(array));
		int[] hist = histogram(array, 100);
		for(int i = 0; i < hist.length; i++) {
			System.out.println(i + "\t" + hist[i]);
		}
	}
	/**
	 * 
	 * @param arr
	 * @return
	 */
	public static int[] histogram(int[] arr, int counters) {
		int counts[] = new int[counters];
		for (int i = 0; i < counts.length; i++) {
			int index = arr[i];
			counts[index]++;
		}
		return counts;
	}
}
