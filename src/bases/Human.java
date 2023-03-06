/**
 *
 */
package bases;

import utils.Dice;

/**
 * @author alley
 *
 */
public abstract class Human extends Living {

	/**
	 * @param name
	 * @param weapon
	 */
	public Human(String name, String weapon) {
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	/* (非 Javadoc)
	 * @see bases.Living#attack(bases.Living)
	 */
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int h_damage = Dice.get(1, 10) * this.getOffensive();

		// 相手のHPをダメージ値だけ減らす
		int hp = target.getHp();
		hp = hp - h_damage;
		target.setHp(hp);

		// 自分の攻撃力を1だけ減らす
		h_damage--;

		// コンソールにステータスを表示
		System.out.println(this.getName() + "が" + this.getWeapon() + "で攻撃！" + target.getName() + "に" + h_damage
				+ "のダメージを与えた。しかし自分の攻撃力も1減少した。");

	}


//	@Override
//	public String toString() {
//		return String.format("[名前]: %s, [ヒットポイント]: %d, [攻撃力]: %d", this.getName(), this.getHp(), this.getOffensive());
//
//	}

}
