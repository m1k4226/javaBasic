package kadai.kadai6;

public class BookAction1 {
	
	//	mainメソッド忘れずに
	public static void main(String[] args) {

		//	Bookクラスのオブジェクトを生成し変数b1に代入
		//	インスタンス名：b1
		Book b1 = new Book("走れメロス",450,"太宰治");
		
		//	書籍情報を出力
		b1.showInfo();
		
		System.out.println("---");
		
		//	Bookクラスのオブジェクトを生成しItemクラスの変数i1に代入
		//	Bookクラスのオブジェクト生成だから、newする右側
		//	Itemクラスの変数i1だから左側
		Item i1 = new Book("シャーロックホームズ",600,"コナン・ドイル");
		
		//	商品情報を出力
		i1.showInfo();
		
		}
	}
