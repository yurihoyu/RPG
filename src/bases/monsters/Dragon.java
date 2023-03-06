package bases.monsters;

import bases.Monster;
import utils.Dice;

public class Dragon extends Monster {

	public Dragon(String name, String weapon) {
		super(name, weapon);

		// ヒットポイント(乱数)
		int hp = Dice.get(270, 330);
		this.setHp(hp);
		//攻撃力(乱数)
		int damage = Dice.get(12, 18);
		this.setOffensive(damage);
	}

}


