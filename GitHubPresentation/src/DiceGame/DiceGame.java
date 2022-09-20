package DiceGame;

public class DiceGame {

	public static void main(String[] args) {
		Player playerOne = new Player();
		Player playerTwo = new Player();
		
		playerOne.addDice(new DFour());
		playerOne.addDice(new DSix());
		
		playerTwo.addDice(new DFour());
		playerTwo.addDice(new DSixRigged());
		

	}

}
