package DiceGame;

import java.util.ArrayList;
import java.util.List;

public class Player {
	
	private static List<Dice> dice = new ArrayList<Dice>();
	
	
	public void addDice(Dice die) {
		dice.add(die);
	}
	
	/**
	 * phillip
	 */
	public void rollDice() {
		ArrayList<Integer> rolls;
		
		for (Dice die : dice) {
			rolls.add(die.roll());
		}
		
		return rolls;
	}

}