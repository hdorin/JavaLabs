package lab3;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;


class AssetManager {
<<<<<<< HEAD
	private ArrayList<Item> itemNames;
=======
	private ArrayList<Item> items = new ArrayList<>(50);
>>>>>>> ace642ca7b7d852a26ee4af98181c86f0c283014


	public void add(Item ... itemsArg) {
		this.itemNames.addAll(Arrays.asList(itemsArg));

		Collections.sort(itemNames);
	}
<<<<<<< HEAD
	public String getItems(){
		return " ";
=======
	public void add(Item ... itemsArg) {
        this.items.addAll(Arrays.asList(itemsArg));
		Collections.sort(items);
	}


    public ArrayList<Item> getItems(){
		return items;
>>>>>>> ace642ca7b7d852a26ee4af98181c86f0c283014
	}


}
