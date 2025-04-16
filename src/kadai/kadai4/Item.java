package kadai.kadai4;

public class Item {
	
	//	フィールド
	String name;
	Integer price;
	
	//	情報出力メソッド
	void showInfo() {
		System.out.println("名前："+name);
		System.out.println("価格(税抜き):"+price+"円");
		System.out.println("価格(税込み):"+(int)(price * 1.1)+"円");
	}
}
