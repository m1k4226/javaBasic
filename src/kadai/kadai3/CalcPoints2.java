package kadai.kadai3;

import java.util.Scanner;

public class CalcPoints2 {

	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ
			Scanner scan = new Scanner(System.in);
			
			System.out.print("購入金額：");
			int price = scan.nextInt();
			
			System.out.println("1:プレミア会員,2：無料会員");
			System.out.print("会員ランク");
			int rank = scan.nextInt();
			
//			static int 
//			if (rank == 1) {
//				return (int) (price * 0.2);
//			} else {
//				return (int) (price * 0.1);
//			}
				scan.close();
		}
	}
