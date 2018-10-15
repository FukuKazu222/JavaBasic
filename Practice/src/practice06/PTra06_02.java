package practice06;
/*
 * PTra06_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_02 {
	public static void main(String[] args) {

		// ★ 20回繰り返しを行うfor文を記述してください

		for(int index=0;index<=20;index++) {
		//-----for start
			// ★ 今何回目の処理なのかを出力してください
		System.out.println(index+"回目");

			// ★ 奇数回のときには、「奇数」を出力してください
		if (index%2!=0) {
		System.out.println("奇数");
		}else {
			continue;
		}
		}
		//-----for end
	}
}
