package lab3;

public abstract class Item {
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
}
