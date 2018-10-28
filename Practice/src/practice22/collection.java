package practice22;

import java.util.ArrayList;

public class collection {
	public static void main(String[] args) {
		ArrayList <String> co = new ArrayList<String>();
		co.add("10");
		co.add("100");
		co.add("200");

		for(int i = 0;i< co.size();i++) {
		System.out.println(co.get(i));
		}
	}
}
