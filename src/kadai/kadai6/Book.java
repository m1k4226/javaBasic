package kadai.kadai6;

public class Book extends Item {
	
	//	新しいフィールド
	private String author;
	
	//	デフォルトコンストラクタ
	public Book() {
		// TODO 自動生成されたコンストラクター・スタブ
	}
	
	//	全要素コンストラクタ
	public Book(String name, Integer price, String author) {
		//	親クラスのコンストラクタを呼ぶ
		super(name, price);
		//	新しいフィールド文の初期化
		this.author = author;
	}
	
	//	ゲッターセッター
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
	
	//	親クラスのshowInfoをオーバーライド
	public void showInfo() {
		super.showInfo();
		System.out.println("著者：" + author);
	}
	
}
