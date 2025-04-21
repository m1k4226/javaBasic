package kadai.kadai5;

public class Item {
	
	//	フィールド
	private String name;
	private int price;
	
	//	デフォルトコンストラクタ	
	public Item() {
	}
	
	//	引数ありコンストラクタ
	//	引数：呼び出し元から値を受け取る
	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
//	情報出力メソッド
	public void showInfo() {
		System.out.println();
	}
	
}
