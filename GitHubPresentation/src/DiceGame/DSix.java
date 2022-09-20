package DiceGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * Rolls a random number from 1 to 6.
 * @author Michael Peeler
 *
 */
public class DSix implements Dice {
	
	private static final Random RANDOM = new Random();
	
	private static final int MAX = 6;

	@Override
	public int roll() {
		return RANDOM.nextInt(6) + 1;
	}

	/**
	 * TODO: Tate
	 */
	@Override
	public int rollN(int n) {
		List<Integer> vals = new ArrayList<Integer>;
		for (int i = 0; i < n; i++) {
			vals.add(roll());
		}
		return vals;
	}

	@Override
	public int numSides() {
		return(MAX);
	}

	/**
	 * TODO: Ting
	 */
	@Override
	public List<Integer> sideValues() {
		List<Integer> vals = new ArrayList<>();
		for (int i = 1; i < MAX + 1; i++) {
			vals.add(i);
		}
		return vals;
	}

}
