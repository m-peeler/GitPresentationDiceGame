package DiceGame;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

/**
 * 
 * Always returns either 2, 3, 4, 5, or 6, and returns 6 one-third of the time.
 * @author Michael Peeler
 *
 */
public class DSixRigged implements Dice {
	
	/**
	 * TODO: Crouse (As well as roll())
	 */
	private final static List<Integer> list = new ArrayList<Integer>(Arrays.asList(new Integer[] {2, 3, 4, 5, 6, 6}));
	private static Random RANDOM = new Random(100021332);

	@Override
	public int roll() {
		return list.get(RANDOM.nextInt(list.size()));
	}

	/**
	 * TODO: Mike
	 */
	@Override
	public List<Integer> rollNDice(int n) {
		List<Integer> rolls = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			rolls.add(roll());
		}
		return rolls;
	}

	@Override
	public int numSides() {
		return list.size();
	}

	@Override
	public List<Integer> sideValues() {
		return list;
	}

}
