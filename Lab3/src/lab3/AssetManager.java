package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class AssetManager {
	private ArrayList<Item> itemNames;


	public void add(Item ... itemsArg) {
		this.itemNames.addAll(Arrays.asList(itemsArg));

		Collections.sort(itemNames);
	}
	public String getItems(){
		return " ";
	}


}
