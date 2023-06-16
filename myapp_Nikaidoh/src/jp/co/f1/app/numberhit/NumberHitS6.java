package jp.co.f1.app.numberhit;

import java.util.Scanner;
import java.util.InputMismatchException;

public class NumberHitS6 {

	public static void main(String[] args) {

		/*
		 * プログラム名:数字当てプログラム
		 * プログラムの説明:キーボード入力の例外処理
		 *
		 * 作成者　二階堂光
		 * 作成日　2023/4/18
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("ゲーム開始");
		System.out.println();

		int answerNum = 5;

		while(true) {
			try {

				System.out.print(" 0から9までの予想の数字を入力>>");
				int playerNum = sc.nextInt();



				//System.out.println("  →予想数字は" + playerNum + "です。");
				//System.out.println("  →正解数字は" + answerNum + "です。");

				//ゲームを終了させる処理
				//範囲外の入力チェック

				if(playerNum == 999) {
					System.out.println("  →999が入力されたためゲームを終了します。");
					break;
				}else if(playerNum < 0 || playerNum > 9) {
					System.out.println("  →エラー！！0から9までの数字ではありません。");
					System.out.println();
					continue;
				}

			//正解判定

				if(answerNum > playerNum) {
					System.out.println("  →正解数字は" + playerNum + "より大きいです。");
				}else if(answerNum < playerNum) {
					System.out.println("  →正解数字は" + playerNum + "より小さいです。");
				}else {
					System.out.println("  →！！大当たり！！");
					break;
				}
			}catch (InputMismatchException e) {
				System.out.println("  →エラー!!文字が入力されました。");
				sc.next();
			}
		}

		System.out.println();
		System.out.println("ゲーム終了");

	}

}
