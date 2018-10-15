package practice06;
/*
 * PTra06_07.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */

public class PTra06_07 {
	public static void main(String[] args) {

		// ★ for文を使って、以下のような出力になるようにしてください
		/*
		 * 出力結果例
		 * -----------------------------------
		 * □□□□□1
		 * ■□□□□2
		 * ■■□□□3
		 * ■■■□□4
		 * ■■■■□5
		 * ■■■■■6
		 * ■■■■□7
		 * ■■■□□8
		 * ■■□□□9
		 * ■□□□□0
		 */
		for (int sq = 0; sq < 5; sq++) {
			for (int i = 0; i < sq; i++) {
				System.out.print("■");

			}
			for (int i = 5; i > sq; i--) {
				System.out.print("□");

			}
			System.out.println();

		}

		for (int sq = 0; sq < 5; sq++) {
			for (int i = 5; i > sq; i--) {
				System.out.print("■");

			}
			for (int i = 0; i < sq; i++) {
				System.out.print("□");

			}
			System.out.println();
		}
	}
}
