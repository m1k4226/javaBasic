package javaBasic;

//商品(Item2)の情報を継承した「本」のクラスBook
public class Book extends Item2 {
	
	// フィールド(商品名／価格)は引き継いで存在している
	// 本特有のフィールドを追記
	
	// 著者
	private String author;

	// コンストラクタは独自に書かないとダメ
	// デフォルトコンストラクタ
	public Book() {
		// 親クラスのコンストラクタを起動する
		super();
	}
	
	// 引数ありのコンストラクタ
	// 親クラスのフィールドも引数に持たせる
	public Book(String name, int price, String author) {
		// 親クラスのコンストラクタを起動
		// ※引数が対応しているコンストラクタが親クラスに書いてあることが必要
		// ※親クラスのコンストラクタ起動は1処理目に記載する必要がある
		super(name, price);
		// このクラス特有の処理を追加
		this.author = author;
	}
	
	// getter/setterや、Item2に書かれてる機能も存在している
	// 特有のフィールドに対応したgetter/setterも追記が必要

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
	// 親の機能を上書き(オーバーライド)する場合、
	// 同じ「戻り値／メソッド名／引数」を持つメソッドを定義
	
	/**
	 * 情報出力処理
	 * ※親クラスのshowInfoを上書き
	 */
	public void showInfo() {
		System.out.println("商品名：" + super.getName());
		System.out.println("著者：" + this.author);
		System.out.println("価格：" + super.getPrice() + "円");
	}
}