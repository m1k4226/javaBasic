package kadai.kadai6;

public class Human {

	//	フィールド：名前
	//	カプセル化
	private String name;
	
	//	コンストラクタ：デフォルト・名前指定
	public Human() {
	}

	public Human(String name) {
		this.name = name;
		}
	
	//	ゲッターセッター
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	//	情報を表示するメソッド：info(名前：⚪⚪︎︎)
	public void info() {
		System.out.println("名前：" + name);
	}
	
	//	攻撃するメソッド；attack
	public void attack() {
		System.out.println("攻撃した");
	}
	
}
