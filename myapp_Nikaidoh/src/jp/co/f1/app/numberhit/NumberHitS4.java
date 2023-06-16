package jp.co.f1.app.numberhit;

import java.util.Scanner;

public class NumberHitS4 {

	public static void main(String[] args) {

		/*
		 * プログラム名:数字当てプログラム
		 * プログラムの説明:[999]を入力するとゲームを終了する
		 *
		 * 作成者　二階堂光
		 * 作成日　2023/4/12
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("ゲーム開始");
		System.out.println();

		int answerNum = (int)(Math.random() * 9) + 1;

		while(true) {

			System.out.print(" 0から9までの予想の数字を入力>>");
			int playerNum = sc.nextInt();

			//System.out.println("  →予想数字は" + playerNum + "です。");
			//System.out.println("  →正解数字は" + answerNum + "です。");

			if(playerNum == 999) {
				System.out.println("  →999が入力されたためゲームを終了します。");
				break;
			}

			if(answerNum > playerNum) {
				System.out.println("  →正解数字は" + playerNum + "より大きいです。");
			}else if(answerNum < playerNum) {
				System.out.println("  →正解数字は" + playerNum + "より小さいです。");
			}else {
				System.out.println("  →！！大当たり！！");
				break;
			}
			System.out.println();
		}

		System.out.println();
		System.out.println("ゲーム終了");

	}

}
