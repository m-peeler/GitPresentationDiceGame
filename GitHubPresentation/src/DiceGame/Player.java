package DiceGame;

import java.util.ArrayList;

import java.util.List;

public class Player {
	
	private static List<Dice> dice = new ArrayList<Dice>();
	
	
	public void addDice(Dice die) {
		dice.add(die);
	}
	
	/**
	 * TODO: Phillip
	 */
	public void rollDice() {
		ArrayList<Integer> rolls = new ArrayList<Integer>();
		
		for (Dice die : dice) {
			rolls.add(die.roll());
		}
	}

}