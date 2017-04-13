package jp.ma.zundokokiyoshi;

import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;

/*
 * ズンドコキヨシ 配列バージョン
 * 「ズン」「ドコ」のいずれかをランダムで出力し続けて
 * 「ズン」「ズン」「ズン」「ズン」「ドコ」の配列が出たら
 * 「キ・ヨ・シ！」って出力した後終了
 */

public class NewZundokokiyoshi {

	public void zundokoList() {

		Random rnd = new Random();

		Map<Integer, String> map = new HashMap<>();
		map.put(0, "ズン");
		map.put(1, "ドコ");

		// List<String> llist = new ArrayList<>();
		// llist.add("ズン");
		// llist.add("ドコ");

		List<String> list = new ArrayList<>();

		while (true) {

			int index = rnd.nextInt(2);
			list.add(map.get(index)); // 「ズン」「ドコ」がランダムに永遠と入る配列list。

			if (list.size() >= 5) {
				if (list.get(list.size() - 1) == "ドコ" && list.get(list.size() - 2) == "ズン"
						&& list.get(list.size() - 3) == "ズン" && list.get(list.size() - 4) == "ズン"
						&& list.get(list.size() - 5) == "ズン") {
					for (String str : list) {
						System.out.println(str + "!");
					}
					System.out.println("キ・ヨ・シ！");
					break;

				} else {
					continue;
				}
			}

			// if (list.size() >= 5) {
			// if (list.get(list.size() - 1) == "ドコ") {
			// if (list.get(list.size() - 2) == "ズン") {
			// if (list.get(list.size() - 3) == "ズン") {
			// if (list.get(list.size() - 4) == "ズン") {
			// if (list.get(list.size() - 5) == "ズン") {
			// for (String str : list) {
			// System.out.println(str + "!");
			// }
			// System.out.println("キ・ヨ・シ！");
			// break;
			// }
			// }
			//
			// }
			//
			// }
			//
			// }
			//
			// }

			// (その他) index が0,0,0,0,1 になったら終わり。

		}

	}

	public static void main(String[] args) {

		NewZundokokiyoshi nzdkk = new NewZundokokiyoshi();
		nzdkk.zundokoList();

	}

}
