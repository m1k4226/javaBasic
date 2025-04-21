package kadai.kadai6;

public class ItemAction {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//	Itemオブジェクト(ロボット掃除機/50000円)を生成
		Item item1 = new Item("ロボット掃除機",50000);
		//	商品情報を出力
		item1.showInfo();
		
		System.out.println("---");
		
		//	Itemオブジェクト(洗濯機/200000)を生成
		Item item2 = new Item();
		item2.name = "洗濯機";
		item2.price = 200000;
		//	商品情報を出力
		item2.showInfo();
		
	}

}
