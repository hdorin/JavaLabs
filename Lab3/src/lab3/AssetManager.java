package lab3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;


class AssetManager {
	private ArrayList<Item> items = new ArrayList<>(50);
	private ArrayList<Asset> assets = new ArrayList<>(50);


	public AssetManager() {

	}

	public void add(Item ... itemsArg) {
        this.items.addAll(Arrays.asList(itemsArg));


	}


    public ArrayList<Item> getItems(){
		Collections.sort(items, new SortByName());
		return items;
	}
    public ArrayList<Asset> getAssets(){
		Collections.sort(assets, new SortByProfit());
		return assets;
	}
    
    //public ArrayList<Item> getAssests(){
    //	Collection.sort(items,new )
    //}

    class SortByName implements Comparator<Item> {
        public int compare(Item a, Item b)
        {
            return a.getName().compareTo(b.getName());
        }
    }
    
    class SortByProfit implements Comparator<Asset>  {
        public int compare(Asset a, Asset b)
        {
            return a.computeProfit().compareTo(b.computeProfit());
        }
    }
}



