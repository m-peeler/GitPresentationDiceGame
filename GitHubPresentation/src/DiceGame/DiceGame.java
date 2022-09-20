package DiceGame;

import java.util.List;

public class DiceGame {
	
	public static int sum(List<Integer> list) {
		int sum = 0;
		for (int i : list) {
			sum += i;
		}
		return sum;
	}

	public static void main(String[] args) {
		Player playerOne = new Player();
		Player playerTwo = new Player();
		
		playerOne.addDice(new DFour());
		playerOne.addDice(new DSix());
		playerOne.addDice(new DTwenty());
		
		playerTwo.addDice(new DFour());
		playerTwo.addDice(new DSixRigged());
		playerTwo.addDice(new DTwenty());
		
		/**
		 * TODO: Phillip (Should be fixed by changes in Player.java)
		 */
		int oneSum = sum(playerOne.rollDice());
		int twoSum = sum(playerTwo.rollDice());
		
		if (oneSum == twoSum) {
			System.out.println(String.format("It's a tie! $d to $d", oneSum, twoSum));
		} else if (oneSum > twoSum) {
			System.out.println(String.format("Wow, player one! You really beat the odds with the score of $d to $d", 
					oneSum, twoSum));
		} else {
			System.out.println(String.format("Player one, you simply couldn't beat my awesome power. The score is $d to $d", 
					oneSum, twoSum));
		}

	}

}
