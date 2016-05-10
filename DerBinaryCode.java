package defaul;

import java.util.ArrayList;

public class DerBinaryCode {

	private int derNumber;
	private boolean[] derArray;

	public DerBinaryCode(int derNumber) {
		this.derNumber = derNumber;
		boxSize(derNumber); // Determine array size

		calculateBinaryCode(); // Calculate the values and places in the array
		System.out.println();
		fromBooleanToInt(derArray); // Convert from boolean to integer

	}

	// TOOLS//
	////////////////////////////////////////////////////////////////////////////////////////////////////////////////////

	// boxSize will determine how big the array needs to be.
	private void boxSize(int derNumber) {
		int multiplyByTwoTemp = 1;
		int numberOfColumnsToMake = 0;
		do {
			multiplyByTwoTemp = multiplyByTwoTemp * 2;
			numberOfColumnsToMake++;

		} while (derNumber >= multiplyByTwoTemp);
		// While derNumber is bigger than the increment of 2, loop
		// Note: A new column is added after ever multiple of 2

		derArray = new boolean[numberOfColumnsToMake];
	}

	// This is where the processing starts
	public void calculateBinaryCode() {

		// If special case 0 or 1
		if (derArray.length == 1) {
			if (derNumber == 0) {
				derArray[0] = false;
			} else {
				derArray[0] = true;
			}
		} else {

			// Last position in the array
			int derArrayIndexTemp = derArray.length - 1;

			// Loop through the array starting at the end
			while (derArrayIndexTemp != 0) {

				// Calculate the value of the position, then save it to the
				// array
				DerPattern dp = new DerPattern(derNumber);

				boolean tempBool = dp.isValue();
				derArray[derArrayIndexTemp] = tempBool;
				derArrayIndexTemp--;
			}

			// The first position in the array will always be true(1), except if
			// the users input is 0
			derArray[0] = true;
		}

		// Print the array as trues and falses
		System.out.println();
		System.out.println("The result is: ");
		for (int i = 0; i < derArray.length; i++) {
			System.out.print(derArray[i] + ", ");
		}
	}

	// Takes a boolean Array and converts it to an Integer ArrayList, then
	// prints out the result.
	public void fromBooleanToInt(boolean[] arraylist) {

		ArrayList<Integer> derFinalList = new ArrayList<>();

		for (int i = 0; i < arraylist.length; i++) {

			// false == 0
			// true == 1
			if (arraylist[i] == false) {
				derFinalList.add(i, 0);
			} else {
				derFinalList.add(i, 1);
			}

		}
		for (int i : derFinalList) {
			System.out.print(i);
		}
		System.out.println();
	}
}
