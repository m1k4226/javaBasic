package kadai.kadai6;

public class Warrior extends Human {
	
	//	フィールド：親クラスから参照
	//	フィールド：種別	
	//	カプセル化
	private String type;
	
	//	コンストラクタ
	public Warrior() {
	}
	
	//	親クラスのコンストラクタを呼ぶ
	public Warrior(String name,String type) {
		super(name);
		this.type = type;
	}
	
	//	情報を表示するメソッド（オーバーライドしたinfoメソッド）
	//	種別「剣士」、名前「太郎」の場合、"種別：剣士　名前：太郎"　と出力
	public void info() {
		super.info();
		System.out.println("種別：" + type);
	}
	
	//	攻撃するメソッド（オーバーライドしたattackメソッド）
	//	種別「剣士」の場合、"「剣士」は攻撃した"と出力
	public void attack() {
		super.attack();
		System.out.println("「" + type + "」は攻撃した");
	}
	
}
