package jp.microad.zundokokiyoshi;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;

/*
 * ズンドコキヨシ
 * 「ズン」「ドコ」のいずれかをランダムで出力し続けて
 * 「ズン」「ズン」「ズン」「ズン」「ドコ」の配列が出たら
 * 「キ・ヨ・シ！」って出力した後終了
 */

public class Zundokokiyoshi {
	// 無限ループ、乱数の生成、重複を許すリスト配列、条件判定、出力処理

	public void zundokoList() {

		Random rnd = new Random();
		List<String> list = new ArrayList<>();
		list.add("ズン");
		list.add("ドコ");
		String ans = "ズン, ズン, ズン, ズン, ドコ";

		while (true) {
			int index0 = rnd.nextInt(2);
			int index1 = rnd.nextInt(2);
			int index2 = rnd.nextInt(2);
			int index3 = rnd.nextInt(2);
			int index4 = rnd.nextInt(2);

			String listchain = list.get(index0) + ", " + list.get(index1) + ", " + list.get(index2) + ", "
					+ list.get(index3) + ", " + list.get(index4);

			System.out.println(listchain);
			if (listchain.contains(ans))
				break;
		}
		System.out.println("キ・ヨ・シ！");

	}

	public static void main(String[] args) {

		Zundokokiyoshi zdkk = new Zundokokiyoshi();
		zdkk.zundokoList();

	}

}