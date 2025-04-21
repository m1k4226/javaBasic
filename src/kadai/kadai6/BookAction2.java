package kadai.kadai6;

import java.util.ArrayList;
import java.util.List;

public class BookAction2 {
	
	//	mainメソッド忘れずに
	public static void main(String[] args) {
		
		//	Itemクラスの配列を生成しItemとBookのオブジェクトを複数格納する
		//	データ型[] 配列名 = new データ型[要素数];
		
	//	Item[] items = {
	//			new Item("ロボット掃除機",50000),
	//			new Book("鬼滅の包丁",450,"GO峠こよはる"),
	//			new Book("1ピース",500,"尾田A一郎")
	//	};
	
		//	Arrayリスト
		//	List<型> リスト名 = new ArrayList<>();
		List<Item> items = new ArrayList<>();
		items.add(new Item("ロボット掃除機",50000));
		items.add(new Book("鬼滅の包丁",450,"GO峠こよはる"));
		items.add(new Book("1ピース",500,"尾田A一郎"));

		//	繰り返し処理を利用して1件ずつ商品情報を出力する
		//	for (型 変数名 : 配列やリストなどのコレクション)
		for(Item item : items) {
			item.showInfo();
			System.out.println("---");
			
		}
	}
}