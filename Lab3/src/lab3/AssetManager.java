package lab3;

import java.util.ArrayList;
import java.util.Arrays;


class AssetManager {
	private ArrayList<Item> Items;
	public void add(Item ... items) {
		this.Items.addAll(Arrays.asList(items));
		Items.sort();
	}
	public ArrayList<Item> getItems(){
		return Items;
	}
}
