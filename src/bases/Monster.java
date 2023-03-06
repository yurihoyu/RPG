package bases;

import utils.Dice;

public abstract class Monster extends Living {

	// コンストラクタ
	public Monster(String name, String weapon) {
		// Livingクラスで定義したコンストラクタを利用する
		super(name, weapon);
		// TODO 自動生成されたコンストラクター・スタブ
	}

	// attackメソッドのオーバーライド
	@Override
	public void attack(Living target) {
		// 1から10までのサイコロを振り、自分の攻撃力とかけ合わせた値を相手に与えるダメージとする
		int m_damage = Dice.get(1, 10) * this.getOffensive();

		// 相手のHPをダメージ値だけ減らす
		int hp = target.getHp();
		hp = hp - m_damage;
		target.setHp(hp);

		// コンソールにステータスを表示
		System.out.println(this.getName() + "が" + this.getWeapon() + "で攻撃！" + target.getName() + "に" + m_damage
				+ "のダメージを与えた。");

	}

}
