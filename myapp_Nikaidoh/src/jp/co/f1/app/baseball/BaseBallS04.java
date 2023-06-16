package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS04 {

	public static void main(String[] args) {


		/*
		 * プログラム名:野球ゲームプログラム
		 * プログラムの説明:予想数字がユニークになるまでループ
		 *
		 *
		 * 作成者　二階堂光
		 * 作成日　2023/4/14
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("---野球ゲームプログラム開始---");
		System.out.println();

		int[] answer = new int[3];
		String[] playerNum = new String[3];

		while(true) {

			for(int i = 0; i < answer.length; i++) {
				answer[i] = (int)(Math.random() * 9) +1;
			}

			System.out.println("3桁のランダム数字(正解数字)は" + answer[0] + answer[1] + answer[2] + "です。");

			if(answer[0] == answer[1] || answer[1] == answer[2] || answer[0] == answer[2]) {
				System.out.println("⇒重複しています。");
				System.out.println();
			}else {
				System.out.println("⇒ユニークです。");
				System.out.println();
				break ;
			}
		}

		while(true) {

			System.out.print("3桁の数字を入力してください>");
			String str = sc.nextLine();

			for(int i = 0; i < playerNum.length; i++) {
				playerNum[i]  = str.substring(i, i + 1);
			}

			if(playerNum[0].equals(playerNum[1]) || playerNum[1].equals(playerNum[2]) || playerNum[0].equals(playerNum[2])) {
				System.out.println("⇒重複しています。");
				System.out.println();
			}else {
				System.out.println("⇒ユニークです。");
				break;
			}
		}

		System.out.println();
		System.out.println("---野球ゲームプログラム終了---");

	}

}
