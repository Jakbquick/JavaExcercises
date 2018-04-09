
public class Date {
	private int year, month, day;
	public Date() {
		year = 1;
		month = 1;
		day = 1;
	}
	public Date(int year, int month, int day) {
		this.year = year;
		this.month = month;
		this.day = day;
	}
	public static void main(String args[]) {
		Date john = new Date(2000,7,30);
	}
}
