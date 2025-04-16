package kadai.kadai4;

public class UserAction1 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		//	user1オブジェクト
		User user1 = new User();
		
		//	フィールドに値追加　オブジェクトのフィールドの初期化
		user1.name = "田中太郎"; 
		user1.age = 20;
		//	showInfoメソッドを呼び出す
		user1.showInfo();
		
		System.out.println("---");
		
		User user2 = new User();
		
		user2.name = "鈴木一郎";
		user2.age = 25;
		
		user2.showInfo();
	
	}

}
