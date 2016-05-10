package defaul;

public class DerPattern {
	// The static columnMulttiplier will double after each instance
	static int columnMultiplier = 1;
	int derNumber;
	boolean value = false;

	public DerPattern(int derNumber) {
		this.derNumber = derNumber;
		
		calculate(); // Run the pattern
		columnMultiplier = columnMultiplier * 2;
	}

	// TOOLS//
	/////////////////////////////////////////////////////////////////////////////////////////////////

	private void calculate() {
		int trigger = 0;
		while (derNumber >= 0) {

			// (1, 2, 4, 8, 16...)x2 the trigger is the switch that occurs in
			// the patter, depending on the column.
			if (trigger == columnMultiplier) {
				value = !value;
				trigger = 0;
			}

			trigger++;
			derNumber--;
		}
	}

	public boolean isValue() {
		return value;
	}
}