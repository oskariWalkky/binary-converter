/*
 * This is the first program I've written outside a tutorial.
 * I choose to use booleans instead of integers to get rid of any
 * arbitrary limits that needed to be created. False is 0, true is 1.
 * The values are process backwards because there is a distinct pattern.
 * The last column (n) is always alternating 0101. n-1 alternates at
 * 00110011 (n*2). At n-2 it alternates at 00001111 (n*2*2). It is
 * always a multiple of 2. It is easy to see this if you write the
 * binary right aligned.
 * 
 * 1: Get the input number
 * 2: Create array size
 * 3: Process the value, and place it in the array (from last to first)
 * 4: Convert from boolean to integer, and print
 * 
 */

package defaul;

import java.util.Scanner;

public class MainSequence3 {

	public static void main(String[] args) {

		// Create a boolean to exit the while loop, and create a scanner.
		boolean trigger = false;
		Scanner sc;

		// The do-while loop will continue to run until an integer is pass into
		// it.
		do {
			System.out.println("Enter somthing.");
			sc = new Scanner(System.in);

			// If an integer is passed into it.
			if (sc.hasNextInt()) {
				int scTemp = sc.nextInt();
				// (For Testing)System.out.println("You correctly entered: " +
				// scTemp);

				// The boolean 'trigger' is switched to break the loop.
				trigger = true;

				@SuppressWarnings("unused")
				// The input integer is passed to the DerBinaryCode class.
				DerBinaryCode dBC = new DerBinaryCode(scTemp);

			} else {
				// Else if a non-integer is passed into it. This will repeat
				// since the trigger is not changed
				System.out.println("You failed, try again.");
			}

		} while (trigger == false);

		sc.close();
		System.out.println("Congratulations, you did it!");

	}

}
