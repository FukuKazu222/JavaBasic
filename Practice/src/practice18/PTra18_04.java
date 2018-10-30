/*
 * PTra18_04.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

import entity.Player;

public class PTra18_04 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args)throws Exception {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		ArrayList<Player> array = new ArrayList<>();

		try (Scanner scanner = new Scanner (new File("file/BestElevenCandidate.csv"))){
			while(scanner.hasNext()) {
				Player player = new Player();

				String line = scanner.nextLine();

				String[] list = line.split(",",0);
				player.setPosition(list[0]);
				player.setName(list[1]);
				player.setCountry(list[2]);
				player.setTeam(list[3]);

				array.add(player);
			}
		}catch(FileNotFoundException e){
			System.out.println("ファイルが見つかりません");
		}
		// ★ ①のArrayListの中からGK1名、DF4名、MF4名, FW2名をランダムで出力してください
		int u = 0;
		Collections.shuffle(array);
		for(int i=0;i<array.size();i++){

			if(array.get(i).getPosition().equals("GK")&&u==0) {
				u++;
				System.out.println(array.get(i).toString());
				continue;
			}else if(array.get(i).getPosition().equals("GK")&&u==1){
				System.out.println(array.get(i).toString());
				break;
		}else {
			continue;
		}
		}
	}
}

