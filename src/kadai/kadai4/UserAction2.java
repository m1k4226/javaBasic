package kadai.kadai4;

import java.util.Scanner;

public class UserAction2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		
		Scanner scan = new Scanner(System.in);
		
		//	Userオブジェクトを生成し変数userに代入
		User user = new User();
		
		System.out.println("会員を登録します");
		System.out.print("名前：");
		//	情報取得　String input = scan.next();
		user.name = scan.next();

		System.out.print("年齢：");
		//	情報取得　(scan.next()が返す値(=戻り値)を代入する)変数 = scan.next();
		user.age = scan.nextInt();
		
		System.out.println("---");
		System.out.println("会員を登録しました");
		user.showInfo();
	}

}
