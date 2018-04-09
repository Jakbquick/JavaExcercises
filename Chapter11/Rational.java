
public class Rational {
	private int numer, denom;

	public Rational() {
		numer = 0;
		denom = 1;
	}

	public void printRational() {
		System.out.println("Numerator: " + numer + " Denominator: " + denom);
	}

	public void setNumer(int numer) {
		this.numer = numer;
	}

	public void setDenom(int denom) {
		this.denom = denom;
	}
	
	public int getNumer() {
		return this.numer;
	}
	
	public int getDemon() {
		return this.denom;
	}

	public static void main(String args[]) {
		Rational rat = new Rational();
		rat.setNumer(2);
		rat.setDenom(8);
		rat.printRational();
		Rational toAdd = new Rational(2,8);
		rat.add(toAdd);
		System.out.println(rat);
	}

	public String toString() {
		return "Numerator: " + numer + " Denominator: " + denom;
	}

	public Rational(int numer, int denom) {
		this.numer = numer;
		this.denom = denom;
	}

	public void negate() {
		this.numer = -this.numer;
	}

	public void invert() {
		int temp = this.numer;
		this.numer = this.denom;
		this.denom = temp;
	}

	public double toDouble() {
		return (double) this.numer / this.denom;
	}
	public int reduce() {
		int remainder;
		int a = this.numer;
		int b = this.denom;
		while(a != 0 && b != 0) {
			remainder = a % b;
			a = b;
			b = remainder;
		}
		if(b == 0) {
			return a;
		}
		else {
			return b;
		}
	}
	public void add(Rational r) {
		int temp;
		int otherNumer = r.getNumer() * this.getDemon();
		int bigDenom = this.denom * r.getDemon();
		this.numer *= r.getDemon();
		this.numer += otherNumer;
		this.denom = bigDenom;
		//System.out.println(this.numer);
		while (reduce() > 1) {
			temp = reduce();
			//System.out.println(temp);
			this.numer = this.numer/temp;
			this.denom = this.denom/temp;
		}
	}
}
