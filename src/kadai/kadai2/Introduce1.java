package kadai.kadai2;

public class Introduce1 {

		public static void main(String[] args) {
			// TODO 自動生成されたメソッド・スタブ
			
			String[] hobbyList = {"ダンス","映画","バイク"};
			
			System.out.println("私の趣味は、");
			
	//		データ型 変数名 : 配列やリスト名
			for (String hobby : hobbyList) {
				
				System.out.println("・" + hobby);
				
			}
			System.out.print("です");
		}
}
