package DiceGame;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Random;

/**
 * 
 * Rolls a random number from 1 to 4.
 * @author Michael Peeler
 *
 */
public class DFour implements Dice {
	
	/**
	 * TODO: Jake (Includes roll())
	 */
	private static final Random RANDOM = new Random();
	private static final int MAX = 4;

	
	@Override
	public int roll() {
		return RANDOM.nextInt(MAX) + 1;
	}

	/**
	 * TODO: George
	 */
	@Override
	public List<Integer> rollNDice(int n) {
		List<Integer> list = new LinkedList<>();
		for (int i = 0; i < n; i++) {
			list.add(i);
		}
		return list;
	}

	
	@Override
	public int numSides() {
		return MAX;
	}

	@Override
	public List<Integer> sideValues() {
		List<Integer> list = new ArrayList<>();
		for (int i = 1; i < MAX + 1; i++) {
			list.add(i);
		}
		return list;
	}

}
