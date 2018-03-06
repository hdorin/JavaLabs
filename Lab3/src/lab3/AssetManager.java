package lab3;

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
		Collections.sort(items, new Sortbyroll());

	}


    public ArrayList<Item> getItems(){
		return items;
	}


}

class Sortbyroll implements Comparator<Item> {
    public int compare(Item a, Item b)
    {
        return a.getName().compareTo(b.getName());
    }
}
