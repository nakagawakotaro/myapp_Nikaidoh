package jp.co.f1.app.baseball;

public class BaseBallS03 {

	public static void main(String[] args) {


		/*
		 * プログラム名:野球ゲームプログラム
		 * プログラムの説明:正解数字がユニークになるまでループ
		 *
		 *
		 * 作成者　二階堂光
		 * 作成日　2023/4/13
		 */


		System.out.println("---野球ゲームプログラム開始---");
		System.out.println();

		int[] answer = new int[3];

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
				break;
			}
		}

		System.out.println();
		System.out.println("---野球ゲームプログラム終了---");

	}

}
