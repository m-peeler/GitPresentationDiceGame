package DiceGame;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * 
 * Rolls random numbers from 1 to 20.
 * @author Michael Peeler
 *
 */
public class DTwenty implements Dice {
	
	/**
	 * TODO: Dewey
	 */
	private static final int MAXIMUM = 20;
	private static final Random RANDOM = new Random();
	
	@Override
	public int roll() {
		return RANDOM.nextInt(MAXIMUM);
	}
	
	@Override
	public List<Integer> rollNDice(int n) {
		List<Integer> rolls = new ArrayList<Integer>();
		for (int i = 0; i < n; i++) {
			rolls.add(this.roll());
		}
		return rolls;
	}
	
	@Override
	public int numSides() {
		return MAXIMUM;
	}
	
	@Override
	public List<Integer> sideValues() {
		List<Integer> vals = new ArrayList<>();
		for (int i = 1; i < MAXIMUM + 1; i++) {
			vals.add(i);
		}
		return vals;
	}
	
	

}
