package bases.humans;

import bases.Human;
import utils.Dice;

public class Brave extends Human {

	public Brave(String name, String weapon) {
		super(name, weapon);
		// ヒットポイント(乱数)
		int hp = Dice.get(170, 230);
		this.setHp(hp);
		//攻撃力(乱数)
		int damage = Dice.get(7, 13);
		this.setOffensive(damage);
	}

}



