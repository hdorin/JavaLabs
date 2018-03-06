package lab3;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;


class AssetManager implements Comparator<Item>{
	private ArrayList<Item> items = new ArrayList<Item>(50);


	public AssetManager() {

	}
	public void add(Item ... itemsArg) {
        this.items.addAll(Arrays.asList(itemsArg));
		Collections.sort(items);
	}


    public ArrayList<Item> getItems(){
		return items;
	}
    
	
	@Override
	public int compare(Item item1, Item item2) {
		return item1.getName().compareTo(item2.getName());
	}

}