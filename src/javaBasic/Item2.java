package javaBasic;

public class Item2 {

	// フィールド
	// 商品名
	private String name;
	
	// 価格
	private int price;
	
	
	// デフォルトコンストラクタ
	public Item2() {
		
	}

	// 引数有りのコンストラクタ
	public Item2(String name, int price) {
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
	
	/**
	 * 情報出力処理
	 */
	public void showInfo() {
		System.out.println("商品名：" + this.name);
		System.out.println("価格：" + this.price + "円");
	}
	
}