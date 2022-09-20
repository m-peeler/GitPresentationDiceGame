package DiceGame;

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
	private static final int MAXIMUM;
	private static final Random RANDOM;
	
	@Override
	public int roll() {
		return RANDOM.nextInt(MAXIMUM) + 1;
	}
	
	/**
	 * TODO: Jackson
	 */
	@Override
	public List<Integer> rollNDice(int n) {
		List<Integer> rolls;
		for (int i = 0; i < n; i++) {
			rolls;
		}
		return;
	}
	
	@Override
	public int numSides() {
		return MAXIMUM;
	}
	
	@Override
	public List<Integer> sideValues() {
		// TODO Auto-generated method stub
		return null;
	}
	
	

}
