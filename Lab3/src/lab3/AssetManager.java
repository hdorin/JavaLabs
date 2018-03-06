package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


class AssetManager {
	private ArrayList<Item> items;


	public AssetManager() {

	}
	public void add(ArrayList<Item> itemsArg) {
//		this.items.addAll(Arrays.asList(itemsArg));
        items.addAll(itemsArg);
		Collections.sort(items);
	}
	public ArrayList<Item> getItems(){
		return items;
	}


}
