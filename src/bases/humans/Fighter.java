package bases.humans;

import bases.Human;
import utils.Dice;

public class Fighter extends Human {

	public Fighter(String name, String weapon) {
		super(name, weapon);
		// ヒットポイント(乱数)
		int hp = Dice.get(240, 300);
		this.setHp(hp);
		//攻撃力(乱数)
		int damage = Dice.get(17, 23);
		this.setOffensive(damage);
	}

}



