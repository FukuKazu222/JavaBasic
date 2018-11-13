/*
 * PTra16_02.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice16;

public class PTra16_02 {
	public static void main(String[] args) {

		boolean b = true;
		byte by = 100;
		short s = 300;
		char c = '日';
		int i = 1000;
		long l = 2000L;
		float f = 3.14F;
		double d = 453.592;

		// ★ 上記基本型を、それぞれのラッパークラスに代入してください
		Boolean B = new Boolean(b);
		Byte GBye =new Byte(by);
		Short Sh = new Short(s);
		Character Ch = new Character(c);
		Integer In = new Integer(i);
		Long Lol = new Long(l);
		Float Flew = new Float(f);
		Double DDuck = new Double(d);
	}//やってることが違う Boolean B = b;
}
