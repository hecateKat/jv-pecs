package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Truck
 * Do not remove no-field constructor
 */
public class Truck extends Machine {

    private int prodYear;

    public Truck(int prodYear, String name, String color) {
        this.prodYear = prodYear;
        this.setName(name);
        this.setColor(color);
    }

    public Truck() {
    }

    @Override
    public void doWork() {
        System.out.println("Truck started to work");
    }
}
