package main.java;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class Main {

	public static void main(String[] args) {

		// 値を取り出し合計するコードを書いてください。
		int[] array = new int[] { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
		int result_array = 0;

		// TODO ここに合計ロジック記載
		for (int i : array) {
			result_array += i;
		}
		System.out.println("array合計：" + result_array);

		// 値を取り出し合計するコードを書いてください。
		Set<Integer> set = new HashSet<Integer>();
		Collections.addAll(set, 1, 2, 3, 4, 5, 6, 7, 8, 9);
		int result_set = 0;

		// TODO ここに合計ロジック記載
		for (Integer s : set) {
			result_set += s;
		}
		System.out.println("set合計：" + result_set);

		// 値を取り出し合計するコードを書いてください。
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("1", 1);
		map.put("2", 2);
		map.put("3", 3);
		map.put("4", 4);
		map.put("5", 5);
		map.put("6", 6);
		map.put("7", 7);
		map.put("8", 8);
		map.put("9", 9);
		int result_map = 0;

		// TODO ここに合計ロジック記載
		for (String key : map.keySet()) {
			result_map += map.get(key);
		}
		System.out.println("map合計：" + result_map);

		// 値を取り出し合計するコードを書いてください。
		List<Model> list = new ArrayList();
		list.add(new Model(1));
		list.add(new Model(2));
		list.add(new Model(3));
		list.add(new Model(4));
		list.add(new Model(5));
		list.add(new Model(6));
		list.add(new Model(7));
		list.add(new Model(8));
		list.add(new Model(9));

		int result_list = 0;

		// TODO ここに合計ロジック記載
		for (Model model : list) {
			result_list += model.getAmount();
		}
		System.out.println("list合計：" + result_list);

		// 値を取り出し合計するコードを書いてください。
		List<List<Model>> finalList = new ArrayList<List<Model>>();
		finalList.add(new ArrayList<Model>() {
			{
				add(new Model(1));
				add(new Model(2));
				add(new Model(3));
				add(new Model(4));
				add(new Model(5));
				add(new Model(6));
				add(new Model(7));
				add(new Model(8));
				add(new Model(9));
			}
		});
		int result_final = 0;

		// TODO ここに合計ロジック記載
		// Listの取り出し
		for (List<Model> listModel : finalList) {
			// ArrayListの取り出し
			for (Model model : listModel) {
				result_final += model.getAmount();
			}
		}
		System.out.println("final合計：" + result_final);

	}

	static class Model {
		private int amount;

		Model(int amount) {
			this.amount = amount;
		}

		public int getAmount() {
			return amount;
		}

		public void setAmount(int amount) {
			this.amount = amount;
		}
	}

}