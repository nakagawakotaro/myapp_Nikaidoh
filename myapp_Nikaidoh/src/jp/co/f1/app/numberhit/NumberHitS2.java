package jp.co.f1.app.numberhit;

import java.util.Scanner;

public class NumberHitS2 {

	public static void main(String[] args) {

		/*
		 * プログラム名:数字当てプログラム
		 * プログラムの説明:予想数字と正解数字を比較して正解判定を行う
		 *
		 * 作成者　二階堂光
		 * 作成日　2023/4/12
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("ゲーム開始");
		System.out.println();

		int answerNum = (int)(Math.random() * 9) + 1;

		System.out.print(" 0から9までの予想の数字を入力>>");
		int playerNum = sc.nextInt();

		//System.out.println("  →予想数字は" + playerNum + "です。");
		//System.out.println("  →正解数字は" + answerNum + "です。");

		if(answerNum > playerNum) {
			System.out.println("  →正解数字は予想数字より大きいです。");
		}else if(answerNum < playerNum) {
			System.out.println("  →正解数字は予想数字より小さいです。");
		}else {
			System.out.println("  →！！大当たり！！");
		}

		System.out.println();
		System.out.println("ゲーム終了");

	}

}
