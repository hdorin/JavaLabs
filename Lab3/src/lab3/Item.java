package lab3;

abstract class Item  implements Comparable<Item>{
    /**
     * @param name of the object
     */
    protected String name;

    Item(){

    }
    Item(String name){
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }
    
	@Override
	public int compareTo(Item i) {
		return i.name.compareTo(this.name);
	}
    
}
