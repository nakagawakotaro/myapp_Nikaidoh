package jp.co.f1.app.baseball;

import java.util.Scanner;

public class BaseBallS07 {

	public static void main(String[] args) {

		/*
		 * プログラム名:野球ゲームプログラム
		 * プログラムの説明:ボールの数を計算して出力する。
		 *
		 *
		 * 作成者 二階堂光
		 * 作成日 2023/4/14
		 */

		Scanner sc = new Scanner(System.in);

		System.out.println("---野球ゲームプログラム開始---");
		System.out.println();

		int countStrike;
		int countTry = 0;
		int countBall;
		int[] answer = new int[3];
		int[] playerNum = new int[3];

		while (true) {

			for (int i = 0; i < answer.length; i++) {
				answer[i] = (int) (Math.random() * 9) + 1;
			}

			System.out.println("3桁のランダム数字(正解数字)は" + answer[0] + answer[1] + answer[2] + "です。");

			if (answer[0] == answer[1] || answer[1] == answer[2] || answer[0] == answer[2]) {
				System.out.println("⇒重複しています。");
				System.out.println();

			} else {
				System.out.println("⇒ユニークです。");
				System.out.println();
				break;

			}
		}

		Outer: while (true) {

			countTry++;
			countStrike = 0;
			countBall = 0;

			System.out.print("3桁の数字を入力してください>");
			String str = sc.nextLine();

			for (int i = 0; i < playerNum.length; i++) {
				playerNum[i] = Integer.parseInt(str.substring(i, i + 1));
			}

			if (playerNum[0] == (playerNum[1]) || playerNum[1] == (playerNum[2]) || playerNum[0] == (playerNum[2])) {
				System.out.println("⇒重複しています。");
				System.out.println();
				continue;

			} else {
				System.out.println("⇒ユニークです。");

			for (int i = 0; i < 3; i++) {
				if (answer[i] == playerNum[i]) {
					countStrike++;
				}

				if (countStrike == 3) {
					break Outer;
				}

				if(answer[0] == playerNum[1]) {
					countBall++;
				}else if(answer[0] == playerNum[2]) {
					countBall++;
				}else if(answer[1] == playerNum[0]) {
					countBall++;
				}else if(answer[1] == playerNum[2]) {
					countBall++;
				}else if(answer[2] == playerNum[0]) {
					countBall++;
				}else if(answer[2] == playerNum[1]) {
					countBall++;
				}
			}
				System.out.println("判定: " + countStrike + "ストライク、" + (countBall - countStrike) + "ボールです。");
				System.out.println();
			}
		}

			System.out.println(countTry + "回トライし、3桁数字を当てました。You Win!!");

			System.out.println();
			System.out.println("---野球ゲームプログラム終了---");
	}
}