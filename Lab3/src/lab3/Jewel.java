package lab3;

class Jewel extends Item {
	private String name;
	private int price;
	Jewel(String name, int price){
		this.name=name;
		this.price=price;
	}

	public int getPrice() {
		return this.price;
	}

    @Override
    public String getName() {
        return this.name;
    }

    public String toString(){
		return getName() + " " + getPrice();
	}
}
