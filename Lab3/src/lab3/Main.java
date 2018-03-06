package lab3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Building building1 = new Building("House 1", 27, 9);
        Building building2 = new Building("House 1", 27, 9);
        Building building3 = new Building("House 1", 27, 9);
        Vehicle vehicle1 = new Vehicle("Car 1", 8, 4);
        Vehicle vehicle2 = new Vehicle("Car 1", 8, 4);
        Jewel jewel = new Jewel("Ring 1", 50);

        AssetManager manager = new AssetManager();
        manager.add(building1, building2, building3);
        manager.add(vehicle1, vehicle2);
        manager.add(jewel);

        System.out.println("Items sorted by the name: " + manager.getItems());
    }
}
