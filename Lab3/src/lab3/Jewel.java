package lab3;

class Jewel extends Asset{
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
    public Integer computeProfit() {
        return 0;
    }

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String toString(){
		return getName() + " " + getPrice();
	}
}
