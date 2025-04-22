package kadai.kadai7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringCart2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
		Scanner scan = new Scanner(System.in);

		//	文字列を保持できるリストの作成
		List<String> list = new ArrayList<>();
		//	キーボードからリストに追加するを3回繰り返す
		for (int i = 0;i < 3;i++) {
			System.out.println("商品を追加してください");
			list.add(scan.next());
		}
		//	拡張for文を利用して全商品を出力する
		for (String item:list) {
			System.out.println(item);
		}
		scan.close();
	}

}
