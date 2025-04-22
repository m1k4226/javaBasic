package kadai.kadai7;

public class Item {
	
	//	フィールド：商品（name）、価格（price）
	private String name;
	private Integer price;
	
	//	コンストラクタ：デフォルトコンストラクタ、引数からすべてのフィールド初期化するコンストラクタ
	public Item() {
	}
	
	public Item (String name, Integer price) {
		this.name = name;
		this.price = price;
	}
	
	//	メソッド：ゲッターセッター
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public Integer getPrice() {
		return price;
	}
	
	public void setPrice(Integer price) {
		this.price = price;
	}
	
	//	showInfo（引数・戻り値なし・商品名出力・価格出力）
	public void showInfo() {
		System.out.println("商品名；" + name);
		System.out.println("価格：" + price + "円");
	}
	
	// getInfoメソッドの追加
	public String getInfo() {
		return name + "（" + price + "円）";
	}
}
