package kadai.kadai4;

public class ItemAction {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//	Itemクラスのフィールドをオブジェクト生成、変数item1に代入
		//	クラス名　オブジェクト名　=　new　クラス名();
		Item item1 = new Item();
		
		//	オブジェクトitem1に値を入れる
		//	オブジェクト名.変数　= 値;　　※オブジェクトのフィールド(Itemクラス)の初期化
		item1.name = "絵本";
		item1.price = 1000;
		
		//	item1の情報を出力
		System.out.println("名前：" + item1.name);
		System.out.println("価格：" + item1.price+"円");
		
		//	Step3の処理
		System.out.println("---");
		
		//	オブジェクトitem2生成
		Item item2 = new Item();
		
		//	オブジェクトitem2の値入れる
		item2.name = "シャンプー";
		item2.price = 222;
		
		//	メソッドの呼び出し　オブジェクト名.メソッド名(引数);
		item2.showInfo();
			
		
	}

}
