package lab3;

class Building extends Asset {
    private Integer area, price;

    Building(String name, Integer area, Integer price){
    	this.name=name;
        this.area = area;
        this.price = price;
    }

    @Override
    public Integer computeProfit() {
        return area / price;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public Integer getArea() {
        return area;
    }

    public Integer getPrice() {
        return price;
    }

    @Override
    public String toString(){
        return getName() + " " + getArea() + " " + getPrice();
    }
}
