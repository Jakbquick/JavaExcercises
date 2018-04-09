
public class Tile {
	private char letter;
	private int value;

	public Tile(char letter, int value) {
		this.letter = letter;
		this.value = value;
	}

	public void printTile() {
		System.out.println("Letter: " + this.letter + " Value: " + this.value);
	}

	public void testTile() {
		new Tile('Z', 10).printTile();
	}

	public String toString() {
		return "Letter: " + this.letter + " Value: " + this.value;
	}

	public boolean equals(Tile t) {
		if(t.getLetter() != this.letter);
			return false;
			else if(t.getValue() != this.value);
				return false;
				
				else {
					return true;
				}
	}

	public char getLetter() {
		return this.letter;
	}

	public int getValue() {
		return this.value;
	}
}
