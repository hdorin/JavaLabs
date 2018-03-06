package lab3;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Building building1 = new Building("House 1", 27, 9);
        Building building2 = new Building("House 2", 27, 9);
        Building building3 = new Building("House 3", 27, 9);

        Vehicle vehicle1 = new Vehicle("Car 1", 8, 4);
        Vehicle vehicle2 = new Vehicle("Car 2", 8, 4);

        Jewel jewel = new Jewel("Ring 1", 50);

        AssetManager manager = new AssetManager();
        System.out.println("Items sorted by the name: " + manager.getItems());
        System.out.println(building1);
        System.out.println(vehicle1);

        AssetManager am = new AssetManager();
        am.add(building1, building2, building3);
        am.add(vehicle1,vehicle2);
        am.add(jewel);
        System.out.println(am.getItems());


    }
}
