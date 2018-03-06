package lab3;

class Vehicle extends Item implements Asset{
    private Integer performance, price;

    Vehicle(String name, Integer performance, Integer price){
        super(name);
        this.performance = performance;
        this.price = price;
    }

    @Override
    public Integer computeProfit() {
        return this.performance / this.price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public void setPerformance(Integer performance) {
        this.performance = performance;
    }

    public Integer getPrice() {
        return this.price;
    }

    public Integer getPerformance() {
        return this.performance;
    }

    @Override
    public String toString(){
        return getName() + " " + getPerformance() + " " + getPrice();
    }
}
