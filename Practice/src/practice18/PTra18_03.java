/*
 * PTra18_03.java
 *   作成	LIKEIT	2017
 *------------------------------------------------------------
 * Copyright(c) Rhizome Inc. All Rights Reserved.
 */
package practice18;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

import entity.Player;

public class PTra18_03 {

	/*
	 * PTra19_02で作成したPlayerクラスを使用します
	 */

	public static void main(String[] args) {

		/*
		 * ①
		 * ★ file/BestElevenCandidate.csvの内容を取得し、１行毎にPlayerインスタンスに情報を格納してください
		 * ★ ArrayListを作成して、Playerインスタンスを格納してください
		 */
		//
		ArrayList<Player> array = new ArrayList<>();
		
        try(Scanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))) {
            while (scanner.hasNext()) {
            	//while構文の中でPlayer型インスタンスの領域を確保しないと一つ領域を確保した時点で操作が止まってしまうので
            	//一つのデータしか保管することができなくなってしまう
            	Player player = new Player();

                String line = scanner.nextLine();
                //String型配列listにカンマ区切りで取得したlineの情報をしまっておく
                String[] list = line.split(",",0);
                //Player型インスタンスplayer(whileの回数だけ確保される)のsetterを呼び出し、ひとつ前の操作でしまった
                //lineの情報を配列listという"箱"ごとplayerにしまっておく。
                	player.setPosition(list[0]);
                	player.setName(list[1]);
                	player.setCountry(list[2]);
                	player.setTeam(list[3]);
                //ArrayList<Player>という型のコレクションの"箱"であるarrayにインスタンス、playerの各情報を並べてしまっておく。
                	array.add(player);
            }
            //このtry,catchはScanner scanner = new Scanner(new File("file/BestElevenCandidate.csv"))を成り立たせる(例外
            //に対する処理を定め操作を命令する[例外が発生する可能性があるとプログラムの実行が拒まれる])ための探知機構
            }  catch (FileNotFoundException e) {
                System.out.println("ファイルが見つかりません");
            }

		// ★ ①のArrayListの中から"レアル・マドリード", "バルセロナ"の選手を除外してください


        for(//昇順に操作していくとコレクションの中での順番がずれてしまうので降順に行う
        		int i =array.size()- 1;i >= 0;i--) {
        	if(//array.get(i)のgetTeamという操作で得られた結果が("バルセロナ")と等しいかどうか
        			array.get(i).getTeam().equals("バルセロナ") ||
        	   //もしくは同じものが("レアル・マドリード")と等しいかどうか
        			array.get(i).getTeam().equals("レアル・マドリード")) {
        	   //条件を満たしたのなら
        		array.remove(i);
        		//そのarrayの値を取り除く
        	}
        }
		// ★ 削除後のArrayListの中身を全件出力してください

        for(int i =0;i< array.size();i++) {
	        	System.out.println(
	        			//array.get(i)のtoString()という操作(メソッド)を実行せよ、ということ
	        			array.get(i).toString());
        }
	}
}
