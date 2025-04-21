package kadai.kadai6;

public class Item {

	//	フィールド：商品名（name）、価格（price）
	public String name;
	public Integer price;

	//	コンストラクタ
	public Item(){
	}
	
	public Item(String name,Integer price){
		this.name = name;
		this.price = price;
	}
	
//	ゲッターセッター
	
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
	
//	情報出力用
	public void showInfo(){
		System.out.println("商品名：" + name);
		System.out.println("価格：" + price + "円");
	}
}
