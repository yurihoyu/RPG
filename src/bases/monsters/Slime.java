package bases.monsters;

import bases.Monster;
import utils.Dice;

public class Slime extends Monster {

	public Slime(String name, String weapon) {
		super(name, weapon);

		// ヒットポイント(乱数)
		int hp = Dice.get(70, 130);
		//攻撃力(乱数)
		int damage  = Dice.get(5, 11);
	}
	
	public void choiceHuman() {}

}

