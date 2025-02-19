package core.mate.academy.model;

/**
 * Add some custom fields that could be only in Bulldozer
 * Do not remove no-args constructor
 */
public class Bulldozer extends Machine {

    private String manufacturer;

    public Bulldozer(String manufacturer, String name, String color) {
        this.manufacturer = manufacturer;
        this.setName(name);
        this.setColor(color);
    }

    public Bulldozer() {
    }

    @Override
    public void doWork() {
        System.out.println("Bulldozer started to work");
    }
}
