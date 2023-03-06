package bases.humans;

import bases.Human;
import utils.Dice;

public class Wizard extends Human{

	public Wizard(String name, String weapon) {
		super(name, weapon);
		// ヒットポイント(乱数)
		int hp  = Dice.get(120, 180);
		this.setHp(hp);
		//攻撃力(乱数)
		int damage  = Dice.get(12, 18);
		this.setOffensive(damage);
	}

}

