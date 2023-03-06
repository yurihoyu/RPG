package bases.monsters;

import bases.Monster;
import utils.Dice;

public class Oak extends Monster {

	public Oak(String name, String weapon) {
		super(name, weapon);

		// ヒットポイント(乱数)
		int hp = Dice.get(170, 230);
		//攻撃力(乱数)
		int damage  = Dice.get(9, 15);
	}

}

