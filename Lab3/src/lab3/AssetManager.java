package lab3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


class AssetManager {
	private ArrayList<Item> items = new ArrayList<>(50);


	public AssetManager() {

	}
	public void add(Item ... itemsArg) {
        this.items.addAll(Arrays.asList(itemsArg));
		Collections.sort(items);
	}


    public ArrayList<Item> getItems(){
		return items;
	}


}
