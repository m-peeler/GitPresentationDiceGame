package DiceGame;

import java.util.List;

/**
 * 
 * @author Michael Peeler
 * Always returns either 2, 3, 4, 5, or 6, and returns 6 one-third of the time.
 *
 */
public class DRigged implements Dice {
	
	/**
	 * TODO: Crouse (As well as roll())
	 */
	private final static List<Integer> list = new ArayList<>(Arrays.asList(new int[] {2, 3, 4, 5, 6, 6}));
	private static Random RANDOM = new RANDOM(100021332);

	@Override
	public int roll() {
		return list.get(RANDON.nextInt(list.size()));
	}

	@Override
	public List<Integer> rollN(int n) {
		List<Integer> 
	}

	@Override
	public int numSides() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Integer> sideValues() {
		// TODO Auto-generated method stub
		return null;
	}

}
