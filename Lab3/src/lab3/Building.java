package lab3;

public class Building extends Item implements Asset {
    private Integer area, price;

    Building(String name, Integer area, Integer price){
        super(name);
        this.area = area;
        this.price = price;
    }

    @Override
    public Integer computeProfit(Object obj) {
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
}
