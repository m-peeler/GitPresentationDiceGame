package DiceGame;

import java.util.List;

/**
 * 
 * Always returns either 2, 3, 4, 5, or 6, and returns 6 one-third of the time.
 * @author Michael Peeler
 *
 */
public class DSixRigged implements Dice {
	
	/**
	 * TODO: Crouse (As well as roll()) CROUSE WAS HERE
	 */
	private final static List<Integer> list = new ArayList<>(Arrays.asList(new Integer[] {2, 3, 4, 5, 6, 6}));
	private static Random RANDOM = new RANDOM(100021332);

	@Override
	public int roll() {
		return list.get(RANDON.nextInt(list.size()));
	}

	/**
	 * TODO: Mike
	 */
	@Override
	public List<Integer> rollNDice(int n) {
		List<Integer> = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			add(roll());
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
