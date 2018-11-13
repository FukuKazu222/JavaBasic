package practice10;
/*
 * PTra10_06.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra10_06 {

	/*
	 * PTra10_05で作成したCarクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * carインスタンスを3件作成し、それぞれの色、ガソリンを入力して決定してください
		 * 各carインスタンスのrunメソッドを実行して、それぞれ「目的地にまでn時間かかりました。残りのガソリンは、xリットルです」を出力してください。
		 */
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		final int distance = 300;
//入力してもらうプログラムなので指示と違う
		car1.color ="white";
		car1.gasoline =50;

		car2.color ="black";
		car2.gasoline =60;

		car3.color ="yellow";
		car3.gasoline =46;

		Car[] car = {car1, car2,car3};

		for(int i = 0;i<car.length;i++) {

			int sum = 0;
			int n = 0;
			while (true) {
				int ce = car[i].run();
				n++;
				if (ce == -1) {
					System.out.println("目的地に到達できませんでした");
					break;
				}
				sum += ce;
//				System.out.println(sum);
				if(sum> distance) {
					System.out.println("目的地にまで"+n+"時間かかりました。残りのガソリンは、"+car[i].gasoline+"リットルです");
					break;
				}

			}
		}


	}
}
