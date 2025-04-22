package javaBasic;

public class ItemAction2 {

	public static void main(String[] args) {

		// Item2クラスのオブジェクトの生成
		Item2 item1 = new Item2("ロボット掃除機", 50000);
		
		// 情報出力
		item1.showInfo();
		
		System.out.println("---");
		
		// Bookクラスのオブジェクトを生成
		Book book = new Book();
		
		// 値を設定
		book.setName("ハリー・〇ッター");
		book.setPrice(1980);
		book.setAuthor("J.K.ローリング");
		
		// 情報出力
		book.showInfo();
//		System.out.println("著者：" + book.getAuthor());
		
		System.out.println("---");
		// 継承が発生している場合のみの特殊ルール
		// ★親クラスのデータ型に、子クラスのオブジェクトを入れることが可能
		// →「本」や「ゲーム」も「商品の一部である」
		Item2 item2 = new Book("ドラエもん", 500, "藤子・F・不二雄");
		
		item2.showInfo();
		
		// item2の中にsetAuthorが存在しないので、
		// 外から値を設定するのが難しい
		// item2.setAuthor()	→はできない
		// →型変換を行えばできる
		
		// この変数[item2]の中身のオブジェクトが
		// 「Book型」で生成されていればtrue
//		if(item2 instanceof Book) {
	}
//			Book book2 = (Book) item2;
//		}

}
